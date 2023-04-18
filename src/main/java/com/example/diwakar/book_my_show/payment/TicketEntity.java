package com.example.diwakar.book_my_show.payment;

import java.util.Date;
import java.util.List;

import com.example.diwakar.book_my_show.commons.Auditable;
import com.example.diwakar.book_my_show.show.ShowEntity;
import com.example.diwakar.book_my_show.show.ShowSeatEntity;
import com.example.diwakar.book_my_show.user.UserEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tickets")
public class TicketEntity extends Auditable{
    @ManyToOne
    private UserEntity bookedBy;
    @ManyToOne
    private ShowEntity show;
    @ManyToMany
    private List<ShowSeatEntity> showSeats;
    private Date timeOfBooking;
    
    @Enumerated(EnumType.STRING)
    private TicketStatus status;

    @OneToMany(mappedBy = "ticket")
    private List<PaymentEntity> payments;
}
