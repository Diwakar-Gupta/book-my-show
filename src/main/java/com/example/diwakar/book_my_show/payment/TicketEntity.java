package com.example.diwakar.book_my_show.payment;

import java.util.Date;
import java.util.List;

import com.example.diwakar.book_my_show.show.ShowEntity;
import com.example.diwakar.book_my_show.show.ShowSeatEntity;
import com.example.diwakar.book_my_show.user.UserEntity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tickets")
public class TicketEntity {
    private UserEntity bookedBy;
    private ShowEntity show;
    private List<ShowSeatEntity> showSeats;
    private Date timeOfBooking;
    private TicketStatus status;
    private List<PaymentEntity> payments;
}
