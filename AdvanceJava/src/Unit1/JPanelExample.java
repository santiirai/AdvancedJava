/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shanti
 */
public class JPanelExample {
    public static void main(String[] args)
        {
            JFrame f = new JFrame("Example");
            f.setSize(400, 400);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setLayout(null);
            
            JPanel p = new JPanel();
            p.setBounds(00,0,300,200);
            p.setBackground(Color.LIGHT_GRAY);
            
            JButton b = new JButton("Click");
            b.setBackground(Color.ORANGE);
            p.add(b);
            
            f.add(p);
            
            f.setVisible(true);
        }
    
}
