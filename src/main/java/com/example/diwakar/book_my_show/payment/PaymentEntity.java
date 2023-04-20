package com.example.diwakar.book_my_show.payment;

import java.util.Date;

import com.example.diwakar.book_my_show.commons.Auditable;
import com.example.diwakar.book_my_show.ticket.TicketEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "payments")
public class PaymentEntity extends Auditable {
    @Enumerated(EnumType.STRING)
    private PaymentMethod method;
    private Date paymentDate;
    private double amount;
    private String transactionId;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @ManyToOne
    private TicketEntity ticket;
}
