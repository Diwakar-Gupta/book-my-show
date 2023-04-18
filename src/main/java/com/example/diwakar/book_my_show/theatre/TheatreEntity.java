package com.example.diwakar.book_my_show.theatre;

import java.util.List;

import com.example.diwakar.book_my_show.auditorium.AuditoriumEntity;
import com.example.diwakar.book_my_show.city.CityEntity;
import com.example.diwakar.book_my_show.commons.Auditable;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "theatres")
public class TheatreEntity extends Auditable{
    private String name;
    private String address;

    @ManyToOne
    private CityEntity city;

    @OneToMany
    private List<AuditoriumEntity> auditoriums;
}
