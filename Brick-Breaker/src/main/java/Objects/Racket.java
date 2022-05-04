package main.java.Objects;

import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.naming.directory.DirContext;
import javax.swing.ImageIcon;

import main.java.Config.Configurations;
import main.java.Interfaces.IKeyDirection;
import main.java.Interfaces.ISteerable;
import main.java.com.normalDirectionState;
import main.java.com.switchedDirectionState;

public class Racket extends Sprite {

    private int dx;
    private IKeyDirection directionState ;

    public Racket(int racket) throws IOException {
        initRacket(racket);
        directionState = new normalDirectionState();
    }

    private void initRacket(int racket) throws IOException {
        loadImage(racket);
        getImageDimensions();
        resetState();
    }

    private void loadImage(int racket) throws IOException {

        ImageIcon ii;
        if (racket == 1) {
            ii = new ImageIcon(ImageIO.read(getClass().getResource("/images/longPaddle.png")));
        } else if (racket == 2) {
            ii = new ImageIcon(ImageIO.read(getClass().getResource("/images/shortPaddle.png")));
        } else {
            ii = new ImageIcon(ImageIO.read(getClass().getResource("/images/paddle.png")));
        }
        image = ii.getImage();
    }

    public void move() {

        setX(getX() + dx);
        if (getX() <= 0) {

            setX(0);
        }

        if (getX() >= Configurations.WIDTH - getImageWidth()) {

            setX(Configurations.WIDTH - getImageWidth());
        }
    }

    public void keyPressed(KeyEvent e, int select) {
        dx = directionState.specificMove(e, select);
    }

    public void keyReleased(KeyEvent e, int select) {

        int key = e.getKeyCode();
        if (select == 0) {
            if (key == KeyEvent.VK_LEFT) {

                dx = 0;
            }

            if (key == KeyEvent.VK_RIGHT) {

                dx = 0;
            }
        } else {
            if (key == KeyEvent.VK_A) {

                dx = 0;
            }

            if (key == KeyEvent.VK_D) {

                dx = 0;
            }
        }
    }

    public void setDirectionState( int val ) {
        if ( val == 0 ) {
            directionState = new normalDirectionState() ;
        }
        else if ( val == 1 ) {
            directionState = new switchedDirectionState() ;
        }
    }

    private void resetState() {
       // setLocation(Configurations.INIT_PADDLE_X, Configurations.INIT_PADDLE_Y);
       x = Configurations.INIT_PADDLE_X;
        y = Configurations.INIT_PADDLE_Y;
    }
}