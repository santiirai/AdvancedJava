/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author Shanti
 */
public class ThreadSafe extends JFrame{
    ThreadSafe(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Example");//creates title
        setSize(400, 400);//size: width x height
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args){
        EventQueue.invokeLater(()->{new ThreadSafe();});
    }
}
