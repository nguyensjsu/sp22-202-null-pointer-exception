package main.java.com;

import java.awt.event.KeyEvent ;
import main.java.Interfaces.IKeyDirection ;
import main.java.Objects.Racket;

public class NormalDirectionState implements IKeyDirection {

    public void specificMove(int key, int select, Racket racket) {
        if (select == 0) {
            if (key == KeyEvent.VK_LEFT) {
                racket.changeDx(-2);
            }
            if (key == KeyEvent.VK_RIGHT) {
                racket.changeDx(2);
            }
        }
        if (select == 1) {
            if (key == KeyEvent.VK_A) {
                racket.changeDx(-2);
            }
            if (key == KeyEvent.VK_D) {
                racket.changeDx(2);
            }
        }
    }

}
