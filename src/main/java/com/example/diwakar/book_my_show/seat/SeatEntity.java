package com.example.diwakar.book_my_show.seat;

import com.example.diwakar.book_my_show.commons.Auditable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name="seats")
public class SeatEntity extends Auditable{
    private String name;

    private SeatType seatType;
    private SeatStatus seatStatus;
}
