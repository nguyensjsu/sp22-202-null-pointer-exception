package main.java.Objects;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import main.java.Config.Configurations;

import java.io.File;
import java.io.IOException;

public class Ball extends Movable {

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

        setLocation(getX() + xdir, getY() + ydir);

        if (getX() + 2 >= (Configurations.WIDTH)) {
            xdir *= -1;
            setXDir(xdir);
        } else if (getX() <= 0) {
            xdir *= -1;
            setX(xdir);
        } else if (getY() <= 0) {
            ydir *= -1;
            setY(ydir);
        }

        if ( getY() + 2 >= (Configurations.HEIGHT) ) {
            ydir *= -1 ;
            setYDir( ydir ) ;
        }
    }

    private void resetState() {
        setLocation(Configurations.INIT_BALL_X, Configurations.INIT_BALL_Y);
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