package main.java.com;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioFiles {

   private static AudioInputStream as = null;
   private static File f = null;
   private static Clip c = null;
   static boolean musicIsPlaying = false;

    public static void playMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

       

    }

    public static void playMusicForGameOver()
    throws UnsupportedAudioFileException, IOException, LineUnavailableException {

}


public static void playMusicForVictory()
        throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    
}

public static void stopMusic() throws Exception {

    if (c != null) // do not nest it to the previous condition ...
    {
       
      
    }
}
    
}
