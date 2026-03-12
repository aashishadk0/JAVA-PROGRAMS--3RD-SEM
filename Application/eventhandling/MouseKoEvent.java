package eventhandling;

import java.awt.event.*;
import javax.swing.*;

public class MouseKoEvent implements MouseListener {
    JFrame f;
    JTextField t;

    MouseKoEvent() {
        f = new JFrame();
        t = new JTextField();
        t.setBounds(40, 60, 80, 20);
        f.add(t);
        f.setSize(300, 400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        t.setText("Clicked");
    }

    public void mousePressed(MouseEvent me) {
        t.setText("Pressed");
    }

    public void mouseReleased(MouseEvent me) {
        t.setText("Released");
    }

    public void mouseEntered(MouseEvent me) {
        t.setText("Entered");
    }

    public void mouseExited(MouseEvent me) {
        t.setText("Exited");
    }

    public static void main(String[] args) {
        new MouseKoEvent();
    }
}