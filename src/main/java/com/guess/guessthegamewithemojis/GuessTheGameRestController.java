package com.guess.guessthegamewithemojis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.objenesis.ObjenesisHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GuessTheGameRestController {
    @Autowired
    private GuessTheGameService guessTheGameService;

    @GetMapping(value = "/get-random-hint", produces = "application/json")
    public ResponseEntity<Game> getRandomHint() {
        //Game rdr2hint = new Game(1,"Red Dead Redemption 2", "\uD83E\uDD20\uD83D\uDC0E\uD83D\uDD2B\uD83D\uDCB0\uD83C\uDF35");
        Game randomGame = guessTheGameService.getRandomGame();
        ResponseEntity<Game> r = new ResponseEntity<Game>(randomGame, HttpStatus.OK);
        return r;
    }

    @GetMapping(value = "/submit-game", produces = "application/json")
    public ResponseEntity<Object> submitGame(@RequestParam Long gameId, @RequestParam String submittedGameName) {
        boolean isCorrect = guessTheGameService.isCorrect(gameId, submittedGameName);
        Object json = "{\"isCorrect\":" + isCorrect + "}";

        // ResponseEntity ile JSON'u ve HTTP durum kodunu döndürebiliriz
        return ResponseEntity.status(HttpStatus.OK).body(json);
    }
    @GetMapping(value ="/auto-complete", produces = "application/json")
    public ResponseEntity<Object> autoComplete(@RequestParam String q){
        List<String> autoCompleteList = guessTheGameService.autoComplete(q);
        return ResponseEntity.status(HttpStatus.OK).body(autoCompleteList);
    }
}
