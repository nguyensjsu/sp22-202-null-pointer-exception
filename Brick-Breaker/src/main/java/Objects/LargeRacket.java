package main.java.Objects;

import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import main.java.Interfaces.*;

public class LargeRacket extends RacketDecorator {
    
    public LargeRacket( IRacket R ) {
        super( R ) ;
    }

    public void loadImage() throws IOException {
        ImageIcon ii;
        ii = new ImageIcon(ImageIO.read(getClass().getResource("/images/longPaddle.png")));
        image = ii.getImage();
    }
}
