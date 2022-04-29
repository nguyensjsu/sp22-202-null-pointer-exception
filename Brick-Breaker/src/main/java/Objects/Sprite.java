package main.java.Objects;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Sprite {

//    int x;
//    int y;
    public double x;
    public double y;
    int imageWidth;
    int imageHeight;
    Image image;
    Rectangle2D rectangle2D = new Rectangle2D.Double();

    public void setX(double x) {

        this.x = x;
    }

    public double getX() {

        return x;
    }

    protected void setY(double y) {

        this.y = y;
    }

    public double getY() {

        return y;
    }

    public int getImageWidth() {

        return imageWidth;
    }

    public int getImageHeight() {

        return imageHeight;
    }

    public Image getImage() {

        return image;
    }

    public Rectangle2D getRect() {
        rectangle2D.setRect(x, y, image.getWidth(null), image.getHeight(null));

        return rectangle2D;
//        return new Rectangle(x, y,
//                image.getWidth(null), image.getHeight(null));
    }

    void getImageDimensions() {

        imageWidth = image.getWidth(null);
        imageHeight = image.getHeight(null);
    }
}