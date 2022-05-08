package main.java.com;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class GameMusic implements AudioStrategy{

    BrickBreaker bb  ;

    

    // public static  void playMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException
    // {
       
 
    
       
    // }

    @Override
    public void sort() throws Exception {

        
        GameBoard.f = new File("Brick-Breaker/src/main/java/music/music_bg.wav").getAbsoluteFile();
        GameBoard.as = AudioSystem.getAudioInputStream(GameBoard.f);
        GameBoard.c = AudioSystem.getClip();
        GameBoard.c.open(GameBoard.as);
        // Plays audio once
        GameBoard.c.start();
        GameBoard.c.loop(Clip.LOOP_CONTINUOUSLY);
        GameBoard.c.stop();
        GameBoard.c.flush();
        GameBoard.c.close();
        GameBoard.f = new File("Brick-Breaker/src/main/java/music/music_bg.wav").getAbsoluteFile();
        GameBoard.as = AudioSystem.getAudioInputStream(GameBoard.f);
        GameBoard.c = AudioSystem.getClip();
        GameBoard.c.open(GameBoard.as);
        // Plays audio once
        GameBoard.c.start();
        GameBoard.c.loop(Clip.LOOP_CONTINUOUSLY);
        // File audioFile = new File("Brick-Breaker/src/main/java/music/music_bg.wav").getAbsoluteFile();
        // AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
        // Clip clip = AudioSystem.getClip();
        // clip.open(audioInputStream);
        // // Plays audio once
        // clip.start();
        // clip.loop(Clip.LOOP_CONTINUOUSLY);
        GameBoard.musicIsPlaying = true;
        // AudioFiles.stopMusic();
        // AudioFiles.playMusic();
    }
    
}
