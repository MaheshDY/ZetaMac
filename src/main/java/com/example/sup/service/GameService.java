package com.example.sup.service;

import com.example.sup.model.Game;
import com.example.sup.repository.GameRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

  private final GameRepository gameRepository;

  @Autowired
  public GameService(GameRepository gameRepository) {
    this.gameRepository = gameRepository;
  }

  @Transactional
  public void save(Game game) {
    gameRepository.save(game);
  }
}
