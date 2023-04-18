package com.example.diwakar.book_my_show.show;

import com.example.diwakar.book_my_show.commons.Auditable;
import com.example.diwakar.book_my_show.seat.SeatType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "seat_type_show_price")
public class SeatTypeShowPriceEntity extends Auditable{

    @ManyToOne
    private ShowEntity show;
    private int price;
    
    @ManyToOne
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
}
