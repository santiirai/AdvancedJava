/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Shanti
 */
public class JTableExample {
    public static void main(String[] args){
        JFrame f = new JFrame("EXample");
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String Title[] = {"S.N","Name","Address"};
        String data[][] = {
        {"1","Ram","Itahari"}, 
        {"2","Sita","Dharan"}, 
        {"3","Hari","KTM"}
        };
        JTable t = new JTable(data, Title);
        JScrollPane s = new JScrollPane(t);
        f.add(s);
        
        f.setVisible(true);
    }
}
