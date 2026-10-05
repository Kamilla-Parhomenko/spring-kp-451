package com.game.store.model.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity(name = "games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String genre;
    private Double price;
    @ManyToOne
    private Studio studio;

    public Game(Long id, String name, String genre, Double price, Studio studio) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.price = price;
        this.studio = studio;
    }
}
