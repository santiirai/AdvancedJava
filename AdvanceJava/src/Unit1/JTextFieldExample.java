/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Shanti
 */
public class JTextFieldExample {
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        
        JTextField t1, t2;
        t1 = new JTextField("Full Name");
        t1.setBounds(10,10,150,30);
        
        t2 = new JTextField("Address");
        t2.setBounds(10,60,150,30);
        
        f.add(t1);
        f.add(t2);
        f.setVisible(true);
    }
}
