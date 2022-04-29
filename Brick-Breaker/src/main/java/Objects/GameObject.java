// package main.java.Objects;

// import java.awt.Image;
// import java.awt.geom.Rectangle2D;

// public abstract class GameObject {

//     private double x;
//     private double y;
//     private int imageWidth;
//     private int imageHeight;
//     protected Image image;
//     private Rectangle2D rectangle2D = new Rectangle2D.Double();

//     public void setX(double x) {

//         this.x = x;
//     }

//     public double getX() {

//         return x;
//     }

//     public void setY(double y) {

//         this.y = y;
//     }

//     public double getY() {

//         return y;
//     }

//     public int getImageWidth() {

//         return imageWidth;
//     }

//     public int getImageHeight() {

//         return imageHeight;
//     }

//     public Image getImage() {

//         return image;
//     }

//     public Rectangle2D getRect() {

//         rectangle2D.setRect(x, y, image.getWidth(null), image.getHeight(null));
//         return rectangle2D;

//     }

//     public void getImageDimensions() {
//         imageWidth = image.getWidth(null);
//         imageHeight = image.getHeight(null);
//     }

//     public void setLocation(double x, double y) {

//         this.setX(x);
//         this.setY(y);

//     }

//     public String toString() {
//         String desc = "loc=" + Math.round(getX() * 10.0) / 10.0 + "," + Math.round(getY() * 10.0) / 10.0 + "]";
//         return desc;
//     }
// }
