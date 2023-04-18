package com.example.diwakar.book_my_show.auditorium;

import java.util.List;

import com.example.diwakar.book_my_show.commons.Auditable;
import com.example.diwakar.book_my_show.commons.Feature;
import com.example.diwakar.book_my_show.seat.SeatEntity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Feature> features;
}
