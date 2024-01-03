package Gamepesawat;

import javax.swing.*;
import java.awt.*;

public class bullet {
    private int x;
    private final int y;
    private final Image image;
    boolean visible;
    private final int width;
    private final int height;

    public bullet(int x, int y) {

        ImageIcon ii =
                new ImageIcon(this.getClass().getResource("bullet.png"));
        image = ii.getImage();
        visible = true;
        width = image.getWidth(null);
        height = image.getHeight(null);
        this.x = x;
        this.y = y;
    }


    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }

    public void move() {
        int MISSILE_SPEED = 1;
        x += MISSILE_SPEED;
        int BOARD_WIDTH = 500;
        if (x > BOARD_WIDTH) {
            visible = false;
        }
    }
}

