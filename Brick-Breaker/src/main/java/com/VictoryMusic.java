package main.java.com;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class VictoryMusic implements AudioStrategy{

    BrickBreaker bb  ;
    // private static AudioInputStream as = null;
    // private static File f = null;
    // private static Clip c = null;
    

    // public static  void playMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException
    // {
       
 
    
       
    // }

    @Override
    public void sort() throws Exception {

        GameBoard.f = new File("Brick-Breaker/src/main/java/music/victory_music.wav").getAbsoluteFile();
        GameBoard.as = AudioSystem.getAudioInputStream(GameBoard.f);
        GameBoard.c = AudioSystem.getClip();
        GameBoard.c.open(GameBoard.as);
    // Plays audio once
    GameBoard.c.start();
    GameBoard.c.loop(Clip.LOOP_CONTINUOUSLY);
        // AudioFiles.stopMusic();
        // AudioFiles.playMusicForVictory();
    }
    
}
