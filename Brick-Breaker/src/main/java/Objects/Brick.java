package main.java.Objects;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.IOException;

public class Brick extends Sprite {

    private boolean destroyed;
    private int health;
    private boolean cement;
    private boolean dangerBrick;
    private boolean containsItem;
    private boolean removeLife;
    private boolean containsLife;
    private int createdHealthBrick = 0;
    int noOfDangerBricks = 0;
    private boolean switchArrowDirction;

    public Brick(int x, int y) throws IOException {
        noOfDangerBricks = 0;
        initBrick(x, y);
    }

    private void initBrick(int x, int y) throws IOException {
        this.x = x;
        this.y = y;

        destroyed = false;
        cement = false;
        dangerBrick = false;
        switchArrowDirction = false;
        health = 1;
        containsLife = false;

        // boolean for item drop bricks
        containsItem = false;
        removeLife = false;

        loadImage(0);
        getImageDimensions();

        int random = (int) (Math.random() * 100) + 1;

        if (random > 50 && random <= 80) {
            health += 50;

        } else if (random > 80 && random <= 95) {
            health += 100;
        } else if (random > 95) {
            cement = true;
            loadImage(3);
            getImageDimensions();
        } else if (random > 5 && random < 20) {
            containsItem = true;
            loadImage(4);
        } else if (random > 3 && random <= 5) {

            if (noOfDangerBricks < 3) {
                noOfDangerBricks += 1;
                dangerBrick = true;
                removeLife = true;
                loadImage(1);
            }

            else {
                cement = true;
                loadImage(3);
                getImageDimensions();
            }

        } else if (random == 3 || random == 2) {
            loadImage(5);
            getImageDimensions();
            switchArrowDirction = true;


        } else if (random < 2) { // Possibility of creating a health brick (1% and only one brick can exist at
                                 // once)

            if (createdHealthBrick < 1) {
                createdHealthBrick++;
                containsLife = true;
                loadImage(6);
                getImageDimensions();
            }
        }
    }

    private void loadImage(int index) throws IOException {

        if (index == 0) {
            var ii = new ImageIcon(ImageIO.read(getClass().getResource("/images/brick1.jpg")));
            image = ii.getImage();
        } else if (index == 1) {
            var ii = new ImageIcon(ImageIO.read(getClass().getResource("/images/redBrick.jpg")));
            image = ii.getImage();
        } else if (index == 2) {
            var ii = new ImageIcon(ImageIO.read(getClass().getResource("/images/brick_cracked_2_copy.jpg")));
            image = ii.getImage();
        } else if (index == 3) {
            var ii = new ImageIcon(ImageIO.read(getClass().getResource("/images/cement1.png")));
            image = ii.getImage();
        } else if (index == 4) {
            var ii = new ImageIcon(ImageIO.read(getClass().getResource("/images/itemBrick.jpg")));
            image = ii.getImage();
        } else if (index == 6) {
            var ii = new ImageIcon(ImageIO.read(getClass().getResource("/images/itemBrick2.jpg")));
            image = ii.getImage();
        } else if (index == 5) {
            var ii = new ImageIcon(ImageIO.read(getClass().getResource("/images/switchDirectionBrick.jpg")));
            image = ii.getImage();
        } else {
            System.out.println("Bad index passed to Brick loadImage");
        }

    }

    // 50% chance health = 0 (dies in one hit)
    // 30% change health = 50 (dies in two hits)
    // 15% chance health = 100 (dies in three hits)
    // 5% chance cement (invincible)
    private int getHealth() {
        return health;
    }

    private void setHealth() {
        health -= 50;
    }

    public boolean isCement() {
        return cement;
    }

    public boolean isDangerBrick() {
        return dangerBrick;
    }

    public void doDamage() throws IOException {

        if (!isCement()) {
            setHealth();
            if (getHealth() <= 0) {
                destroyed = true;
            } else if (getHealth() == 1) {
                loadImage(2);
                getImageDimensions();
            } else if (getHealth() == 51) {
                destroyed = true;
            }
        }

    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public boolean hasItem() {
        return containsItem;
    }

    public boolean removeLife() {
        return removeLife;
    }

    public boolean containsLife() {
        return containsLife;
    }

    public boolean isSwitchDirectionBrick() {
        return switchArrowDirction;
    }

}
