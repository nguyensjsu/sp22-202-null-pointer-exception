package main.java.Objects;

import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import main.java.Interfaces.*;

public class SmallRacket extends RacketDecorator {
    
    public SmallRacket( IRacket R ) {
        super(R) ;
    }

    public void loadImage() throws IOException {
        ImageIcon ii;
        ii = new ImageIcon(ImageIO.read(getClass().getResource("/images/ShortPaddle.png")));
        image = ii.getImage();
    }
}
