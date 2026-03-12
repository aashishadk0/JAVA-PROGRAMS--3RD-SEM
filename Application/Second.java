import javax.swing.*;

public class Second {
    Second() {
        JFrame f = new JFrame();
        f.setVisible(true);
        JLabel l = new JLabel("User Name");
        l.setBounds(60, 80, 80, 30);

        JTextField t = new JTextField(20);
        t.setBounds(60, 115, 200, 30);

        JLabel l2 = new JLabel("Password");
        l2.setBounds(60, 145, 80, 30);

        JPasswordField p = new JPasswordField(20);
        p.setBounds(60, 175, 200, 30);

        JButton b = new JButton("Submit");
        b.setBounds(110, 210, 80, 30);

        f.add(l);
        f.add(t);
        f.add(l2);
        f.add(p);
        f.add(b);

        f.setLayout(null);
        f.setSize(350, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Second();
    }
}
