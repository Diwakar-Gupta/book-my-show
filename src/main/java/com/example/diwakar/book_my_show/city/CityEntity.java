package com.example.diwakar.book_my_show.city;

import java.util.List;

import com.example.diwakar.book_my_show.commons.Auditable;
import com.example.diwakar.book_my_show.theatre.TheatreEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "cities")
public class CityEntity extends Auditable {
    
    private String name;
    
    @OneToMany
    private List<TheatreEntity> theatres;
}
