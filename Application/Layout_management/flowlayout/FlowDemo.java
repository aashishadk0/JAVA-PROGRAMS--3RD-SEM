package Layout_management.flowlayout;

import javax.swing.*;
import java.awt.*;

public class FlowDemo {
    FlowDemo() {
        JFrame f = new JFrame();
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setSize(400, 450);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout fl = new FlowLayout(FlowLayout.LEFT, 20, 30);
        f.setLayout(fl);
    }

    public static void main(String[] args) {
        new FlowDemo();
    }
}
