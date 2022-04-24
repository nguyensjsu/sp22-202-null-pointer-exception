import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.EventQueue;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioStream ;
import sun.audio.AudioPlayer ;
//import javax.sound.sampled.*;
import java.io.File;
import java.io.FileInputStream;
//import java.io.IOException;
//import javax.sound.sampled.LineEvent.Type;

public class BrickBreaker extends JFrame {

    public BrickBreaker() throws IOException {

        initUI();
    }

    private void initUI() throws IOException {

        add(new MenuScreen());
        setTitle("Breakout");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            BrickBreaker game = null;
            try {
                playMusic("/Users/varunsluckysmac/Documents/Academics/CMPE 202/Project/Java-Brick-Breaker-Game-main/out/production/concept-AlexHarvey63/music/369920__mrthenoronha__cartoon-game-theme-loop.wav");
                game = new BrickBreaker();
            } catch (IOException e) {
                e.printStackTrace();
            }
            game.setVisible(true);
        });
    }

   public static void playMusic(String filepath)
   {
       InputStream music ;
       try{
music = new FileInputStream(new File(filepath)) ;
AudioStream audio = new AudioStream(music);
AudioPlayer.player.start(audio);

       }
       catch (Exception e)
       {
         //  JOptionPane.showMessageDialog(Bri, message, title, messageType, icon);
       }
   }
}