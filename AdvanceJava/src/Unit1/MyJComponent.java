/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;
//How can we draw on JFrame using JComponent, demonstrate using example
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author Shanti
 */
public class MyJComponent extends JComponent{
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.fillOval(70, 70, 400, 400);
        
    }
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(600, 600);
    //set preferred size of the component
    }
}
class MyJFrame extends JFrame{
    MyJComponent mComponent = new MyJComponent();
    public MyJFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(mComponent);
        pack();
        setVisible(true);
    }
    public static void main(String[] args){
        EventQueue.invokeLater(()->{new MyJFrame();});
    }
}
