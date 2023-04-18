package com.example.diwakar.book_my_show.city;

import com.example.diwakar.book_my_show.commons.Auditable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "cities")
public class CityEntity extends Auditable {
    
    private String name;
}
