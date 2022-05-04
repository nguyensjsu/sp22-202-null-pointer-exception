package main.java.com ;

import java.awt.event.KeyEvent ;
import main.java.Interfaces.IKeyDirection ;

public class normalDirectionState implements IKeyDirection {

    private int dx ;

    public int specificMove(KeyEvent e, int select) {
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
        return dx ;
    }

}