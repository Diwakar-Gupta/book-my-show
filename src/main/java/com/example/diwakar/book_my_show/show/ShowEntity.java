package com.example.diwakar.book_my_show.show;

import java.util.Date;
import java.util.List;

import com.example.diwakar.book_my_show.auditorium.AuditoriumEntity;
import com.example.diwakar.book_my_show.commons.Auditable;
import com.example.diwakar.book_my_show.commons.Feature;
import com.example.diwakar.book_my_show.movie.MovieEntity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "shows")
public class ShowEntity extends Auditable {
    @ManyToOne
    private MovieEntity movie;
    private Date startTime;
    private Date endTime;
    @ManyToOne
    private AuditoriumEntity auditorium;
    
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Feature> features;
}
