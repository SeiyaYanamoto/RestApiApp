package plugin.enemydown.App.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plugin.enemydown.App.mapper.GameConfigMapper;
import plugin.enemydown.App.mapper.data.GameConfig;
import plugin.enemydown.App.mapper.data.SpawnEnemy;

@Service
public class ConfigService {

  @Autowired
  private GameConfigMapper mapper;

  public List<GameConfig> searchConfigList() {
    return mapper.selectConfigList();
  }

  public GameConfig searchConfig(String difficulty) {
    return mapper.selectConfig(difficulty);
  }

  public List<SpawnEnemy> searchSpawnEnemyList(String difficulty) {
    return mapper.selectSpawnEnemyList(difficulty);
  }
  public GameConfig registerConfig(GameConfig config) {
    mapper.insertConfig(config);
    return mapper.selectConfig(config.getDifficulty());
  }

  public List<SpawnEnemy> updateEnemyScore(SpawnEnemy enemy) {
    mapper.updateEnemyScore(enemy);
    return mapper.selectSpawnEnemyList(enemy.getDifficulty());
  }

}
