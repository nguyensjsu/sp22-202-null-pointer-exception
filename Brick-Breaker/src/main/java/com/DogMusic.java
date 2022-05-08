package main.java.com;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class DogMusic implements AudioStrategy{
    
// Perform strategy
    @Override
    public void sort() throws Exception {

        GameBoard.f = new File("Brick-Breaker/src/main/java/music/game_over_music.wav").getAbsoluteFile();
        GameBoard.as = AudioSystem.getAudioInputStream(GameBoard.f);
        GameBoard.c = AudioSystem.getClip();
        GameBoard.c.open(GameBoard.as);
// Plays audio once
GameBoard.c.start();
GameBoard.c.loop(Clip.LOOP_CONTINUOUSLY);

    }
    
}

