import javax.swing.*;

public class DayTwo extends JFrame {
    DayTwo() {
        setSize(400, 700);
        setLayout(null);

        JLabel l1 = new JLabel("Select Gender:");
        JRadioButton r1 = new JRadioButton("Male", true);
        JRadioButton r2 = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        l1.setBounds(40, 2, 100, 20);
        r1.setBounds(60, 25, 100, 20);
        r2.setBounds(170, 25, 100, 20);

        JLabel l = new JLabel("Comment");
        l.setBounds(40, 50, 100, 30);
        JTextArea ta = new JTextArea("Enter your comment here..");
        ta.setBounds(40, 90, 200, 80);

        String str[] = { "Nepal", "India", "China", "Russia" };
        JComboBox cb = new JComboBox(str);
        cb.setBounds(40, 180, 100, 30);

        JLabel l2 = new JLabel("Select Courses:");
        l2.setBounds(40, 210, 150, 30);

        JCheckBox chb = new JCheckBox("Java", true);
        JCheckBox chb1 = new JCheckBox("Python", true);
        JCheckBox chb2 = new JCheckBox("Ruby");

        String title[] = { "ID", "Name", "Address" };
        String data[][] = {
                { "1", "Aashish", "Gaindakot" },
                { "2", "Nabin", "Kawasoti" },
                { "3", "Sandesh", "Harkapur" }
        };

        JTable t = new JTable(data, title);
        JScrollPane sp = new JScrollPane(t);

        chb.setBounds(60, 240, 100, 30);
        chb1.setBounds(60, 280, 100, 30);
        chb2.setBounds(60, 320, 100, 30);

        sp.setBounds(60, 350, 400, 120);

        add(l1);
        add(r1);
        add(r2);

        add(l);
        add(ta);
        add(cb);

        add(l2);
        add(chb);
        add(chb1);
        add(chb2);
        add(sp);

        setTitle("Comment box");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new DayTwo();
    }
}
