/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;
//Create a frame with a button. Once you click the button box will appear. Using the dialog box take two numbers
//from the user and display sum of them on it.

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Shanti
 */
public class DialogBoxPrac {
    public static void main(String[] args){
        JFrame f = new JFrame("EXample");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        
        JButton b = new JButton("Click Here!");
        b.setBounds(200,200,80,25);
        f.add(b);
        
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JDialog d = new JDialog();
                d.setBounds(100,100,250,300);
                d.setLayout(new FlowLayout());
                
                JLabel n1, n2, result;
                JTextField tn1, tn2;
                JButton display;
                
                n1 = new JLabel("Number1:");
                tn1 = new JTextField(10);
                n2 = new JLabel("Number2:");
                tn2 = new JTextField(10);
                
                display = new JButton("Sum");
                result = new JLabel();
                display.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        int num1;
                        int num2, add;
                        num1 = Integer.parseInt(tn1.getText());
                        num2 = Integer.parseInt(tn2.getText());
                        
                        add = num1+num2;
                        
                        result.setText("Sum: "+ add);
                    }
                });                
                d.add(n1); d.add(tn1); 
                d.add(n2); d.add(tn2);
                d.add(display); d.add(result);
                d.setVisible(true);
            }
        });
        f.setVisible(true);
    }
}
