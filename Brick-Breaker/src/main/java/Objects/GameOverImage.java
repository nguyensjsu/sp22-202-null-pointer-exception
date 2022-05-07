package main.java.Objects;

import java.io.File;
import java.io.IOException;

import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import main.java.Interfaces.IImageDisplay;

public class GameOverImage extends ImageDecorator {

    protected Image image;
    
    public GameOverImage( IImageDisplay I ) throws IOException {
        super(I) ;
        this.loadImage();
       
        
    }

    // public GameOverImage(int imageType) throws IOException
    // {
    //    // initImage(imageType);
    // }
    // private void initImage(int imageCount) throws IOException {
    //     loadImage();
       
    // }


    @Override
    public void loadImage() throws IOException {
        ImageIcon ii;
        ii = new ImageIcon(ImageIO.read(getClass().getResource("/images/game_over.png")));
        image = ii.getImage();
    //    Image icon = new ImageIcon(ImageIO.read(new File("Brick-Breaker/src/images/game_over.png"))).getImage();
    //     image = icon.getImage();
    }

    @Override
    public Image getImage() throws IOException {
      
        loadImage() ;
        return image ;
    }
    
}
