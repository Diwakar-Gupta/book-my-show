package com.example.diwakar.book_my_show.payment;

import java.util.Date;

import com.example.diwakar.book_my_show.commons.Auditable;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "payments")
public class PaymentEntity extends Auditable {
    @ManyToOne
    private PaymentMethod method;
    private Date paymentDate;
    private double amount;
    private String transactionId;

    @ManyToOne
    private PaymentStatus paymentStatus;

    @ManyToOne
    private TicketEntity ticket;
}
