package main.java.Objects;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import main.java.Config.Configurations;
import main.java.Interfaces.IKeyDirection;
import main.java.com.NormalDirectionState;
import main.java.com.SwitchedDirectionState;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class Racket extends Sprite {

    private int dx;
    private IKeyDirection directionState ;
    NormalDirectionState normalDirectionState;
    SwitchedDirectionState switchedDirectionState;
    private LinkedHashSet<Integer> activeKeys = new LinkedHashSet<>();

    public Racket(int racket, int select) throws IOException {
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
        activeKeys.add(e.getKeyCode());
        directionState.specificMove(e.getKeyCode(), select, this);
    }

    public void keyReleased(KeyEvent e, int select) {
        activeKeys.remove(e.getKeyCode());
        int key = e.getKeyCode();
        if (select == 0) {
            if (key == KeyEvent.VK_LEFT) {
                dx = 0;
            }
            if (key == KeyEvent.VK_RIGHT) {
                dx = 0;
            }
        }
        if (select == 1) {
            if (key == KeyEvent.VK_A) {
                dx = 0;
            }
            if (key == KeyEvent.VK_D) {
                dx = 0;
            }
        }
        if (!activeKeys.isEmpty()) {
            directionState.specificMove((int)activeKeys.toArray()[activeKeys.size()-1], select, this);
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

    public void changeDx(int dx) {
        this.dx = dx;
    }
}