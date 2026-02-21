package Unit1;

import java.awt.event.*;
import javax.swing.*;

public class MouseEventExample {

    MouseEventExample() {
        JFrame f = new JFrame("MouseEvent Handling");
        f.setSize(300, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse Exited");
            }
        });

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventExample();
    }
}
