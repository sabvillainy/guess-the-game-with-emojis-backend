package com.guess.guessthegamewithemojis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

interface GameName{
    String getName();
}
@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(value = "SELECT * FROM games ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Game findRandomGame();

    List<GameName> findByNameContaining(String name);
}


