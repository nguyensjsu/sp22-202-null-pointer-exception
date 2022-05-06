package main.java.com;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class StopMusic implements AudioStrategy {

    BrickBreaker bb;

    @Override
    public void sort() throws Exception {
        GameBoard.stopMusic();
    }

}
