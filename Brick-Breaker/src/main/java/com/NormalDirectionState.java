package main.java.com ;

import java.awt.event.KeyEvent ;
import main.java.Interfaces.IKeyDirection ;

public class NormalDirectionState implements IKeyDirection {

    public int specificMove(int key, int select) {
        if (select == 0) {
            if (key == KeyEvent.VK_LEFT) {
                return -2;
            } else if (key == KeyEvent.VK_RIGHT) {
                return 2;
            }
        } else if (select == 1) {
            if (key == KeyEvent.VK_A) {
                return -2;
            } else if (key == KeyEvent.VK_D) {
                return 2;
            }
        }
        return 0;
    }

}