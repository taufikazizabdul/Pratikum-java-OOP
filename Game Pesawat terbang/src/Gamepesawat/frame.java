package Gamepesawat;

import javax.swing.*;

public class frame extends JFrame {

    public frame() {
        add(new background());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        setTitle("Battle Planes");
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args) {
        new frame();
    }
}
