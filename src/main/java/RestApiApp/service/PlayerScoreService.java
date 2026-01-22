package RestApiApp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import RestApiApp.mapper.PlayerScoreMapper;
import RestApiApp.mapper.data.PlayerScore;

@Service
public class PlayerScoreService {

  @Autowired
  private PlayerScoreMapper mapper;

  public List<PlayerScore> searchPlayerList() {
    return mapper.selectPlayerScoreList();
  }
}
