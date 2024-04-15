package com.guess.guessthegamewithemojis;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String emojis;

    public Game() {

    }

    public Game(Long id, String name, String emojis) {
        this.id = id;
        this.name = name;
        this.emojis = emojis;
    }

    public String getName() {
        return name;
    }

    public String getEmojis() {
        return emojis;
    }
    public Long getId(){
        return id;
    }
}
