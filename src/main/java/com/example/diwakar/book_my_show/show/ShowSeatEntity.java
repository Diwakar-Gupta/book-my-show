package com.example.diwakar.book_my_show.show;

import com.example.diwakar.book_my_show.commons.Auditable;
import com.example.diwakar.book_my_show.seat.SeatEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "show_seats")
public class ShowSeatEntity extends Auditable {
    @ManyToOne
    private ShowEntity show;
    @ManyToOne
    private SeatEntity seat;
    
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus ShowSeatStatus;
}
