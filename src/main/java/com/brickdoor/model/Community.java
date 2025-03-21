package com.brickdoor.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Table(name = "communities")
@Setter

public class Community {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @Getter
    private LocalDateTime createdAt = LocalDateTime.now();

    public Community() { //Hibernate (which Spring Data JPA uses) requires a no-argument constructor to create instances of entity classes using reflection.
    }

    public Community(String name, String description) {
        this.name = name;
        this.description = description;
        this.createdAt = LocalDateTime.now();
    }

}