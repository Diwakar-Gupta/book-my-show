package com.example.diwakar.book_my_show.ticket;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.example.diwakar.book_my_show.show.ShowSeatEntity;
import com.example.diwakar.book_my_show.show.ShowSeatNotAvailableException;
import com.example.diwakar.book_my_show.show.ShowSeatRepository;
import com.example.diwakar.book_my_show.show.ShowSeatStatus;
import com.example.diwakar.book_my_show.user.UserEntity;
import com.example.diwakar.book_my_show.user.UserRepository;

@Service
public class TicketService {

    private ShowSeatRepository showSeatRepository;
    private UserRepository userRepository;
    private TicketRepository ticketRepository;

    public TicketService(ShowSeatRepository showSeatRepository, UserRepository userRepository,
            TicketRepository ticketRepository) {
        this.showSeatRepository = showSeatRepository;
        this.userRepository = userRepository;
        this.ticketRepository = ticketRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    TicketEntity bookTicket(
            List<Long> showSeatIds,
            Long userId,
            Long showId) throws ShowSeatNotAvailableException {
        List<ShowSeatEntity> showSeats = this.showSeatRepository.findAllByIdIn(showSeatIds);

        for (ShowSeatEntity entity : showSeats) {
            if (!entity.getShowSeatStatus().equals(ShowSeatStatus.Available)) {
                throw new ShowSeatNotAvailableException(entity.getId());
            }
        }

        for (ShowSeatEntity showSeat : showSeats) {
            showSeat.setShowSeatStatus(ShowSeatStatus.Locked);
        }
        this.showSeatRepository.saveAll(showSeats);

        TicketEntity ticket = new TicketEntity();
        UserEntity user = this.userRepository.findById(userId).get();

        ticket.setBookedBy(user);
        ticket.setStatus(TicketStatus.PENDING);
        ticket.setShowSeats(showSeats);
        
        ticket = this.ticketRepository.save(ticket);

        return ticket;
    }
}
