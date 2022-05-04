package main.java.Objects;

import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import main.java.Config.Configurations;
import main.java.Interfaces.IKeyDirection;
import main.java.com.NormalDirectionState;
import main.java.com.SwitchedDirectionState;

public class Racket extends Sprite {

    private int dx;
    private IKeyDirection directionState ;
    NormalDirectionState normalDirectionState;
    SwitchedDirectionState switchedDirectionState;

    public Racket(int racket) throws IOException {
        initRacket(racket);
        normalDirectionState = new NormalDirectionState();
        switchedDirectionState = new SwitchedDirectionState();
        directionState = normalDirectionState;
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
        dx = directionState.specificMove(e.getKeyCode(), select);
    }

    public void keyReleased(KeyEvent e, int select) {
        int key = e.getKeyCode();
        if (select == 0) {
            if (key == KeyEvent.VK_LEFT) {
                dx = 0;
            } else if (key == KeyEvent.VK_RIGHT) {
                dx = 0;
            }
        } else if (select == 1){
            if (key == KeyEvent.VK_A) {
                dx = 0;
            } else if (key == KeyEvent.VK_D) {
                dx = 0;
            }
        }
    }

    public void setDirectionState( int val ) {
        if ( val == 0 ) {
            directionState = normalDirectionState ;
        } else if ( val == 1 ) {
            directionState = switchedDirectionState ;
        }
    }

    private void resetState() {
       // setLocation(Configurations.INIT_PADDLE_X, Configurations.INIT_PADDLE_Y);
       x = Configurations.INIT_PADDLE_X;
       y = Configurations.INIT_PADDLE_Y;
    }
}