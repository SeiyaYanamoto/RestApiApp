## はじめに
- 本リポジトリは、Java を用いた個人開発として  Seiya が作成した Minecraft プラグイン「EnemyDownApp」に関するものです。
- ご利用いただくことによるトラブル等につきましては、一切の責任を負いかねますことを予めご了承ください。

## アプリ概要
- REST APIを用いて、ゲーム時間や難易度などのデータ取得する機能のアプリです。
- データベースの登録・更新はPostmanを用いて、データベースに情報を追加します。

## データベース設計　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　
| 属性 | 設定値 |
|-----|-----|
| データベース名 | enemy_down |
| テーブル名 | 以下の通り |

- game_config
- player_score
- spawn_enemy

## ER図
```mermaid
erDiagram
    game_config ||--o{ spawn_enemy : "敵の出現条件を定義する"
    game_config ||--o{ player_score : "プレイ結果として記録される"
    spawn_enemy ||--o{ player_score : "倒した結果が記録される"

    game_config {
        int id PK "ID"
        int game_time "ゲーム時間"
        string difficulty "難易度"
    }

    spawn_enemy {
        int id PK "ID"
        string difficulty FK "難易度"
        string enemy_name "敵の名前"
        int score "敵の得点"
    }

    player_score {
        int id PK "ID"
        string player_name "プレイヤー名"
        int score "獲得スコア"
        string difficulty FK "難易度"
        datetime registered_at "登録日時"
    }
```

## アプリから情報を取得
https://github.com/user-attachments/assets/c34697a3-ef66-497f-8b93-88bcac84fe62

## アプリへの情報追加・更新
https://github.com/user-attachments/assets/b14f19b3-86cc-417f-a992-2c93cc75affd

## 主な使用技術・環境

| |技術・環境   |
|-----|-----|
| バックエンド |![badge](https://img.shields.io/badge/Oracle%20OpenJDK-21.0.8-grey.svg?style=plastic&logo=openjdk&labelColor=red)&nbsp;![badge](https://img.shields.io/badge/SpringBoot-3.5.7-grey.svg?style=plastic&logo=springboot&labelColor=6DB33F&logoColor=white) |
| データベース |![badge](https://img.shields.io/badge/MySQL-8.0.44-grey.svg?style=plastic&logo=mysql&labelColor=4479A1&logoColor=white) | 
| 使用ツール |![badge](https://img.shields.io/badge/GitHub-181717.svg?style=plastic&logo=github)&nbsp;![badge](https://img.shields.io/badge/MyBatis-DD0700.svg?style=plastic)&nbsp;![badge](https://img.shields.io/badge/Postman-FF6C37.svg?style=plastic&logo=postman&logoColor=white)&nbsp;![badge](https://img.shields.io/badge/intellij%20IDEA-2025.2.3-grey.svg?style=plastic&logo=intellijidea&labelColor=000000)| 

## おわりに
* Java学習者のアウトプットして、リポジトリ公開させていただきました。
* 感想・コメント等あればXアカウント[@Seiya_engineer]( https://x.gd/daily_study)までご連絡くださると幸いです。
