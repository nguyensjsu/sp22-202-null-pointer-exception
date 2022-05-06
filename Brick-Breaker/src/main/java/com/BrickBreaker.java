package main.java.com;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.awt.EventQueue;
import java.io.IOException;
import java.io.File;

public class BrickBreaker extends JFrame {

    public BrickBreaker() throws IOException {

        initUI();
    }

    private void initUI() throws IOException {

        add(new MenuScreen());
        setTitle("Smash Them!");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            BrickBreaker game = null;
            try {
                DataSet dataset = new DataSet() ;
                //playMusic();
     dataset.changeStrategy(new GameMusic());
    dataset.doSort();
                game = new BrickBreaker();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (UnsupportedAudioFileException e) {
                e.printStackTrace();
            } catch (LineUnavailableException e) {
                e.printStackTrace();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            game.setVisible(true);
        });
    }

    public static void playMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        File audioFile = new File("Brick-Breaker/src/main/java/music/music_bg.wav").getAbsoluteFile();
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        // Plays audio once
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        

    }

    public static void stopMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

    }
}