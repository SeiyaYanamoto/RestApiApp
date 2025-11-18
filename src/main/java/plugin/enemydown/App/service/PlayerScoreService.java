package plugin.enemydown.App.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plugin.enemydown.App.mapper.PlayerScoreMapper;
import plugin.enemydown.App.mapper.data.GameConfig;
import plugin.enemydown.App.mapper.data.PlayerScore;

@Service
public class PlayerScoreService {

  @Autowired
  private PlayerScoreMapper mapper;

  public List<PlayerScore> searchPlayerList() {
    return mapper.selectPlayerScoreList();
  }


}
