package Unit1;

import javax.swing.*;

public class BoxLayoutExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("BoxLayout Example");
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");

        f.add(b1);
        f.add(b2);
        
        f.setVisible(true);
    }
}
