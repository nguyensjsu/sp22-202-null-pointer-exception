package main.java.Objects;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import main.java.Config.Configurations;
import java.io.IOException;

public class Item extends Movable {

    private double xdir = 1;
    private double ydir = 1;
    private int item_speed = 1;

    public Item(double x, double y) throws IOException {

        initItem(x, y);
    }

    private void initItem(double x, double y) throws IOException {

        setX(getX() + 20);
        setY(getY() + 10);
        loadImage();
        getImageDimensions();

    }

    private void loadImage() throws IOException {

        var ii = new ImageIcon(ImageIO.read(getClass().getResource("/images/itemDrop.png")));
        image = ii.getImage();
    }

    public void move() {
        setY(ydir);

    }

    void setXDir(double x) {

        xdir = x;
    }

    void setYDir(double y) {

        ydir = y;
    }

    double getXDir() {

        return xdir;
    }

    double getYDir() {

        return ydir;
    }

    public void resetState() {
        setLocation(Configurations.INIT_ITEM_X, Configurations.INIT_ITEM_Y);
    }
}