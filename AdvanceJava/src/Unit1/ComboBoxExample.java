/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Shanti
 */
public class ComboBoxExample {
    public static void main(String[] args){

        JFrame f = new JFrame("EXample");
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        JLabel l = new JLabel("...");
        l.setSize(200,20);
        JButton b = new JButton("Show");
        b.setBounds(200,100,75,20);
        
        String data[] = {"MoMO","Chowmin","Thukpa","Pizza","Tofu"};
        JComboBox cb = new JComboBox(data);
        cb.setBounds(100,40,75,25);
        
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String text = "My favourite food is: "+cb.getItemAt(cb.getSelectedIndex());
                l.setText(text);
            }
        });
        
        f.add(cb);
        f.add(l);
        f.add(b);
        
        f.setVisible(true);
    }
}
