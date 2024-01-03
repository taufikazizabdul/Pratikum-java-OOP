package Gamepesawat;

import javax.swing.*;
import java.awt.*;

public class enemy {

    private int x;
    private final int y;
    private final int width;
    protected final int height;
    private boolean visible;
    private final Image image;

    public enemy(int x, int y) {
        String control = "enemy.png";
        ImageIcon ii = new ImageIcon(this.getClass().getResource(control));
        image = ii.getImage();
        width = image.getWidth(null);
        height = image.getHeight(null);
        visible = true;
        this.x = x;
        this.y = y;
    }


    public void move() {
        if (x < 0) {
            x = 600;
        }
        x -= 1;
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

    public Image getImage() {
        return image;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
}

