package main.java.com;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class DogMusic implements AudioStrategy{
    public static BrickBreaker b ;
    // public static  void playMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException
    // {
       
        // private static AudioInputStream as = null;
        // private static File f = null;
        // private static Clip c = null;
    
       
    // }

    @Override
    public void sort() throws Exception {

        GameBoard.f = new File("Brick-Breaker/src/main/java/music/game_over_music.wav").getAbsoluteFile();
        GameBoard.as = AudioSystem.getAudioInputStream(GameBoard.f);
        GameBoard.c = AudioSystem.getClip();
        GameBoard.c.open(GameBoard.as);
// Plays audio once
GameBoard.c.start();
GameBoard.c.loop(Clip.LOOP_CONTINUOUSLY);
// timer.stop() ;
        // AudioFiles.stopMusic();
        // AudioFiles.playMusicForGameOver();
    }
    
}

