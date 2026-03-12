import javax.swing.*;

public class Demo {
    Demo() {
        JFrame f = new JFrame();
        JButton b = new JButton("Click");
        b.setBounds(140, 90, 40, 20);
        f.add(b);

        f.setSize(300, 400);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
