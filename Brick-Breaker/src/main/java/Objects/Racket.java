package main.java.Objects;

import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import main.java.Config.Configurations;
import main.java.Interfaces.ISteerable;

public class Racket extends Movable implements ISteerable {

    private int dx;

    public Racket(int racket) throws IOException {

        initRacket(racket);
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
        int key = e.getKeyCode();
        if (select == 0) {
            if (key == KeyEvent.VK_LEFT) {

                dx = -2;
            }

            if (key == KeyEvent.VK_RIGHT) {

                dx = 2;
            }
        } else {
            if (key == KeyEvent.VK_A) {

                dx = -2;
            }

            if (key == KeyEvent.VK_D) {

                dx = 2;
            }
        }
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

    private void resetState() {
        setLocation(Configurations.INIT_PADDLE_X, Configurations.INIT_PADDLE_Y);
    }
}