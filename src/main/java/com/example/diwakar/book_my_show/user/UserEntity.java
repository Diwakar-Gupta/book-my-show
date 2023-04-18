package com.example.diwakar.book_my_show.user;

import com.example.diwakar.book_my_show.commons.Auditable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "users")
public class UserEntity extends Auditable{
    private String name;
    private String email;
    private String password;
}
