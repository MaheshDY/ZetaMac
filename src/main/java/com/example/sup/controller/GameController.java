package com.example.sup.controller;

import com.example.sup.model.Game;
import com.example.sup.service.GameService;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@RequestMapping("/game")
@Slf4j
public class GameController {

  private final GameService service;

  @Autowired
  public GameController(GameService service) {
    this.service = service;
  }

  public ResponseEntity<Void> start(@RequestBody @Valid Game game){
    service.save(game);
    return (ResponseEntity<Void>) ResponseEntity.accepted();
  }
}
