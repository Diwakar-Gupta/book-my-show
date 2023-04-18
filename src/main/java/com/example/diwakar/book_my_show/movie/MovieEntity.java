package com.example.diwakar.book_my_show.movie;

import java.util.List;

import com.example.diwakar.book_my_show.commons.Auditable;
import com.example.diwakar.book_my_show.commons.Feature;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "movies")
public class MovieEntity extends Auditable {
    private String name;

    private List<Feature> features;
    private List<Genre> genres;
}
