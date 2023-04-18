package com.example.diwakar.book_my_show.auditorium;

import java.util.List;

import com.example.diwakar.book_my_show.commons.Auditable;
import com.example.diwakar.book_my_show.commons.Feature;
import com.example.diwakar.book_my_show.seat.SeatEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "auditoriums")
public class AuditoriumEntity extends Auditable {
    private String name;

    @OneToMany
    private List<SeatEntity> seats;

    @ManyToMany
    private List<Feature> features;
}
