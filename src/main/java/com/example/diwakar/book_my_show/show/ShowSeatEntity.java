package com.example.diwakar.book_my_show.show;

import com.example.diwakar.book_my_show.commons.Auditable;
import com.example.diwakar.book_my_show.seat.SeatEntity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "show_seats")
public class ShowSeatEntity extends Auditable {
    private ShowEntity show;
    private SeatEntity seat;
    private ShowSeatStatus ShowSeatStatus;
}