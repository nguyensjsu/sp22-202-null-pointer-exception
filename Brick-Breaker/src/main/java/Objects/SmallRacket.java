package main.java.Objects;

import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Image;
import main.java.Interfaces.*;

public class SmallRacket extends RacketDecorator {
    
    public SmallRacket( IRacket R ) throws IOException {
        super(R) ;
        this.loadImage();
        super.getImageDimensions();
        super.resetState();
        
    }

    @Override
    public void loadImage() throws IOException {
        ImageIcon ii;
        ii = new ImageIcon(ImageIO.read(getClass().getResource("/images/shortPaddle1.png")));
        image = ii.getImage();
    }

    @Override
    public Image getImage() {
        return image ;
    }
    
  
}
