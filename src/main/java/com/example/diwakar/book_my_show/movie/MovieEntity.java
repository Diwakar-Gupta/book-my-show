package com.example.diwakar.book_my_show.movie;

import java.util.List;

import com.example.diwakar.book_my_show.actor.ActorEntity;
import com.example.diwakar.book_my_show.commons.Auditable;
import com.example.diwakar.book_my_show.commons.Feature;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "movies")
public class MovieEntity extends Auditable {
    private String name;

    @ManyToMany
    private List<ActorEntity> actors;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Feature> features;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Genre> genres;
}
