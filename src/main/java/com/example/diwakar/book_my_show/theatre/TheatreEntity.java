package com.example.diwakar.book_my_show.theatre;

import com.example.diwakar.book_my_show.city.CityEntity;
import com.example.diwakar.book_my_show.commons.Auditable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "theatres")
public class TheatreEntity extends Auditable{
    private String name;
    private String address;

    private CityEntity city;
}
