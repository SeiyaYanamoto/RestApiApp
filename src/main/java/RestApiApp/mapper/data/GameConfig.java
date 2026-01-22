package RestApiApp.mapper.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 難易度とゲーム時間を扱うオブジェクト。
 * DBに存在するテーブルと連動する。
 */
@Getter
@Setter
@NoArgsConstructor

public class GameConfig {

  private int id;
  private int gameTime;
  private String difficulty;

}
