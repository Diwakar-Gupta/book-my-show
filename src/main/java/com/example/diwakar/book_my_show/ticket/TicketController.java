package com.example.diwakar.book_my_show.ticket;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;

import com.example.diwakar.book_my_show.show.ShowSeatNotAvailableException;

@Controller
public class TicketController {

    private TicketService ticketService;
    private ModelMapper modelMapper;

    public TicketController(TicketService ticketService, ModelMapper modelMapper){
        this.ticketService = ticketService;
        this.modelMapper = modelMapper;
    }

    public BookTicketRequestDto bookTicket(BookTicketRequestDto bookTicketRequestDto) throws ShowSeatNotAvailableException{
        TicketEntity ticket =  this.ticketService.bookTicket(
            bookTicketRequestDto.getShowSeatIds(),
            bookTicketRequestDto.getUserId(),
            bookTicketRequestDto.getShowId());
        
        BookTicketRequestDto ticketResponseDto = this.modelMapper.map(ticket, BookTicketRequestDto.class);
        return ticketResponseDto;
    }
}
