/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit1;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author Shanti
 */
public class DesktopPanelExample extends JFrame{
    private JDesktopPane jd = new JDesktopPane();
    DesktopPaneExample(){
        setTitle("Main window");
        setSize(600,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       setJInternalFrame(jd, "Internal frame 1", 30 ,30);
       setJInternalFrame(jd, "Internal frame 1", 60 ,60);
       add(jd);
    
    }
    void setJInternalFrame(JDesktopPane jd, String name, int loc1, int loc2){
        JInternalFrame jn = new JInternalFrame(name, true, true, true, true);
        jn.setLayout(new FlowLayout());
        jn.setSize(300,300);
        jn.add(new JButton("JButton"));
        jn.setLocation(loc1,loc2);
        jn.setVisible(true);
        jd.add(jn);
    }
    public static void main(String[] args){
        new DesktopPaneExample();
    }
}
