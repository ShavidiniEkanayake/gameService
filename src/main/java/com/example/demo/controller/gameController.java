package com.example.demo.controller;

import com.example.demo.dto.game.gameDTO;
import com.example.demo.service.gameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/game")
@CrossOrigin

public class gameController {
    @Autowired
    private gameService gameService;

    @PostMapping("/saveGame")
    public gameDTO saveGame(@RequestBody gameDTO gameDTO){
        return gameService.saveGame(gameDTO);
    }
}
