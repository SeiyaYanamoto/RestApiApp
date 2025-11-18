package plugin.enemydown.App.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import plugin.enemydown.App.mapper.data.PlayerScore;
import plugin.enemydown.App.service.PlayerScoreService;

@RestController
public class PlayerScoreController {

  @Autowired
  private PlayerScoreService service;

  @RequestMapping(value = "/playerScoreList", method = RequestMethod.GET)
  public List<PlayerScore> playerScoreList() {
    return service.searchPlayerList();
  }
}
