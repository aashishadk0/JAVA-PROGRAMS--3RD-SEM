package Layout_management.borderlayout;

import javax.swing.*;
import java.awt.*;

public class BorderDemo {
    BorderDemo() {
        JFrame f = new JFrame();
        JButton b1 = new JButton("Top");
        JButton b2 = new JButton("Bottom");
        JButton b3 = new JButton("Right");
        JButton b4 = new JButton("Left");
        JButton b5 = new JButton("Center");

        f.add(b5, BorderLayout.CENTER);
        f.add(b4, BorderLayout.WEST);
        f.add(b3, BorderLayout.EAST);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b1, BorderLayout.NORTH);

        f.setSize(400, 450);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new BorderDemo();
    }
}
