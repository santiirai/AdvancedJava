/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Shanti
 */
public class ListExample {
    public static void main(String[] args){
        JFrame f = new JFrame("EXample");
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        
        JLabel l = new JLabel("Please choose the country!");
        l.setSize(500, 500);
        JButton b = new JButton("Show");
        b.setBounds(200,150,80,30);
        
        final DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Nepal");
        l1.addElement("China");
        l1.addElement("Bhutan");
        l1.addElement("USA");
        
        final JList<String> list = new JList<>(l1);
        list.setBounds(100,100,75,75);
        f.add(list);
        
        b.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            String data = "";
            if(list.getSelectedIndex()!=-1){
                data = "Country Seleted is :"+list.getSelectedValue();
            l.setText(data);
        }
        }
        });
                
        f.add(l);
        f.add(b);
        f.setVisible(true);
    }
}
