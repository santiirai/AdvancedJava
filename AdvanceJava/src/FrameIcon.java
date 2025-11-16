
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shanti
 */
public class FrameIcon extends JFrame{
    FrameIcon(){
       setTitle("Example");//creates title
       setSize(400, 400);//size: width x height
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//decide what to do while closing
       
       JButton button = new JButton("Click me");
       add(button);
       
       Image img = new ImageIcon("..//AdvanceJava_2025//src//cat.jpg").getImage();
       setIconImage(img);
       
       setLayout(new FlowLayout());
       setResizable(true);
       setVisible(true);//makes frame visible
    }
    public static void main(String[] args){
        new FrameIcon();
    }
}
