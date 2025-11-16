/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Shanti
 */
public class MyImage1 extends JFrame{
    MyImage1(){
        ImageIcon icon = new ImageIcon("..//MyJavaSwing//src//Unit1//cat.jpg");
        JLabel label = new JLabel(icon);
        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String args){
        new MyImage1();
    }
}
