package com.example.demo.service;

import com.example.demo.dto.game.gameDTO;
import com.example.demo.entity.game;
import com.example.demo.repo.gameRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class gameService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private gameRepo gameRepo;
    public gameDTO saveGame(gameDTO gameDTO){
        gameRepo.save(modelMapper.map(gameDTO, game.class));
        return gameDTO;
    }
}
