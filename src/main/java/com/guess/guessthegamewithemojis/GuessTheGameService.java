package com.guess.guessthegamewithemojis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GuessTheGameService {

    @Autowired
    private GameRepository gameRepository;
    public Game getRandomGame(){
        return gameRepository.findRandomGame();
    }
    public boolean isCorrect(Long gameId, String submittedGameName){
        System.out.println(gameId);
        System.out.println(submittedGameName);
        Game currentGame = gameRepository.findById(gameId).get();
        return currentGame.getName().equalsIgnoreCase(submittedGameName);
    }
    public List<String> autoComplete(String searchWord){
        List<GameName> autoCompleteList = gameRepository.findByNameContaining(searchWord);
        return autoCompleteList.stream().map(GameName::getName).collect(Collectors.toList());
    }
}
