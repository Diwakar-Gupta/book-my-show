package com.example.diwakar.book_my_show.payment;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "payments")
public class PaymentEntity {
    private PaymentMethod method;
    private Date paymentDate;
    private double amount;
    private String transactionId;
    private PaymentStatus paymentStatus;
    private TicketEntity ticket;
}
