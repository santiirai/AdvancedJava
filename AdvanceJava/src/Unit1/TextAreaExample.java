
package Unit1;

import javax.swing.*;

public class TextAreaExample {
     public static void main(String[] args){
        JFrame f = new JFrame();
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        
        JTextArea ta = new JTextArea();
        ta.setBounds(10,40,150,150);
        
        
        f.add(ta);
        f.setVisible(true);
    }
}
