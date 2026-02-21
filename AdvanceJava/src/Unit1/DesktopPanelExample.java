package Unit1;

import java.awt.FlowLayout;
import javax.swing.*;

public class DesktopPanelExample extends JFrame {

    private JDesktopPane jd = new JDesktopPane();

    DesktopPanelExample() {
        setTitle("Main window");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setJInternalFrame(jd, "Internal frame 1", 30, 30);
        setJInternalFrame(jd, "Internal frame 2", 60, 60);

        add(jd);
        setVisible(true);
    }

    void setJInternalFrame(JDesktopPane jd, String name, int loc1, int loc2) {
        JInternalFrame jn = new JInternalFrame(name, true, true, true, true);
        jn.setLayout(new FlowLayout());
        jn.setSize(300, 200);
        jn.add(new JButton("JButton"));
        jn.setLocation(loc1, loc2);
        jn.setVisible(true);
        jd.add(jn);
    }

    public static void main(String[] args) {
        new DesktopPanelExample();
    }
}
