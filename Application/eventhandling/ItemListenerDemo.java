package eventhandling;

import javax.swing.*;
import java.awt.event.*;

public class ItemListenerDemo implements ItemListener {
    JFrame f;
    JCheckBox c;

    ItemListenerDemo() {
        f = new JFrame();
        c = new JCheckBox("Java");
        c.setBounds(100, 120, 80, 20);
        f.add(c);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED)
            System.out.println("Java is Selected");
        else
            System.out.println("Java is not selected");
    }

    public static void main(String[] args) {
        new ItemListenerDemo();
    }
}
