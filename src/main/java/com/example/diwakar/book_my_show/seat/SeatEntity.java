package com.example.diwakar.book_my_show.seat;

import com.example.diwakar.book_my_show.commons.Auditable;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="seats")
public class SeatEntity extends Auditable{
    private String name;
    private int row;
    private int col;

    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    
    @Enumerated(EnumType.STRING)
    private SeatStatus seatStatus;
}
