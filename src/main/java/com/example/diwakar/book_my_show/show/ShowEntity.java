package com.example.diwakar.book_my_show.show;

import java.util.Date;
import java.util.List;

import com.example.diwakar.book_my_show.auditorium.AuditoriumEntity;
import com.example.diwakar.book_my_show.commons.Auditable;
import com.example.diwakar.book_my_show.commons.Feature;
import com.example.diwakar.book_my_show.movie.MovieEntity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "shows")
public class ShowEntity extends Auditable {
    private MovieEntity movie;
    private Date startTime;
    private Date endTime;
    private AuditoriumEntity auditorium;
    private List<Feature> features;
}
