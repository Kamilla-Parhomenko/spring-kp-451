package com.game.store.model.dto.game;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class GameRequest {

    private String title;
    private String genre;
    private Double price;
    private Long studioID;

    public GameRequest(String title, String genre, Double price, Long studioID) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.studioID = studioID;
    }
}
