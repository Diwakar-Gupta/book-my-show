package com.example.diwakar.book_my_show.actor;

import com.example.diwakar.book_my_show.commons.Auditable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "actors")
public class ActorEntity extends Auditable {
    private String name;
}
