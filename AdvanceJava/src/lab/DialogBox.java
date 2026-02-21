/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DialogBox extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField t1, t2;
    JButton b;

    DialogBox() {
        setTitle("Sum of Two Numbers");

        l1 = new JLabel("Enter First Number:");
        l2 = new JLabel("Enter Second Number:");

        t1 = new JTextField(10);
        t2 = new JTextField(10);

        b = new JButton("Add");

        setLayout(new FlowLayout());

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);

        b.addActionListener(this);

        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int c = Integer.parseInt(t2.getText());
        int sum = a + c;

        JOptionPane.showMessageDialog(this, "Sum = " + sum);
    }

    public static void main(String[] args) {
        new DialogBox();
    }
}
