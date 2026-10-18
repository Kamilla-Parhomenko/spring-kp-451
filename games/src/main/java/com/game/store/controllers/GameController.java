package com.game.store.controllers;

import com.game.store.model.entity.Game;
import com.game.store.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;

    @GetMapping("/games")
    public List<Game> getAll(){
        return gameService.getAll();
    }

    @PostMapping("/games")
    public Game create(@RequestBody Game game){
        return gameService.createGame(game);
    }
}
