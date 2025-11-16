/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Shanti
 */
public class CheckBoxExample {
    public static void main(String[] args){

        JFrame f = new JFrame("EXample");
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        JLabel l = new JLabel();
        l.setBounds(10,10,100,30);
        JCheckBox b1 = new JCheckBox("Football");
        b1.setBounds(0,40,100,30);
        JCheckBox b2 = new JCheckBox("Volleyball");
        b2.setBounds(0,80,100,30);
        
        f.add(l);
        f.add(b1);
        f.add(b2);
        f.setVisible(true);
    }
}
