package main.java.Objects;

import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import main.java.Interfaces.*;

public class LargeRacket extends RacketDecorator {
    
    public LargeRacket( IRacket R ) throws IOException {
        super( R ) ;
        this.loadImage();
        super.getImageDimensions();
        super.resetState();
        
    }

    @Override
    public void loadImage() throws IOException {
        ImageIcon ii;
        ii = new ImageIcon(ImageIO.read(getClass().getResource("/images/veryLongPaddle.png")));
        image = ii.getImage();
    }

}
