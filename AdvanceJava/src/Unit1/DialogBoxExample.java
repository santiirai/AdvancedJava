/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Shanti
 */
public class DialogBoxExample {
    public static void main(String[] args){
        JFrame f = new JFrame("EXample");
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        
//        JPanel p = new JPanel();
//        p.setSize(300,300);
        JButton b1 = new JButton("Click Me!");
        b1.setBounds(100,100,80,30);
        f.add(b1);
        
        b1.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               JDialog d = new JDialog();
               d.setBounds(50,50,150,150);
               JLabel l = new JLabel("This is your dialog box");
               l.setBounds(10,10,120,20);
               d.add(l);
               d.setVisible(true);
           }
        });
        
        f.setVisible(true);
    }
}
