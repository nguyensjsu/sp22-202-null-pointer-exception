package main.java.Objects;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import main.java.Config.Configurations;

import java.io.File;
import java.io.IOException;

public class Ball extends Sprite  {

    private double xdir;
    private double ydir;

    public Ball() throws IOException {

        initBall();
    }

    private void initBall() throws IOException {

        xdir = 1;
        ydir = -1;

        loadImage();
        getImageDimensions();
        resetState();
    }

    private void loadImage() throws IOException {

        var ii = new ImageIcon(ImageIO.read(getClass().getResource("/images/ball.png")));
        image = ii.getImage();

    }

    public void move() {

        x += xdir ;
        y += ydir ;

        // setLocation(getX() + xdir, getY() + ydir);

        if (x + 2 >= (Configurations.WIDTH)) {
            xdir *= -1;
            setXDir(xdir);
        } else if (x <= 0) {
            xdir *= -1;
            x = xdir;
        } else if (y <= 0) {
            ydir *= -1;
            y = ydir ;
        }

        if (y + 2 >= (Configurations.HEIGHT) ) {
            ydir *= -1 ;
           y = ydir ;
        }
    }

    private void resetState() {
       // setLocation(Configurations.INIT_BALL_X, Configurations.INIT_BALL_Y);
       x = Configurations.INIT_BALL_X ;
       y = Configurations.INIT_BALL_Y ;
    }

    public void setXDir(double x) {

        xdir = x;
    }

    public void setYDir(double y) {

        ydir = y;
    }

    public double getYDir() {

        return ydir;
    }
}