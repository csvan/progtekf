package ex5.question1;

import javax.swing.*;

/**
 * This class IS a JFrame, since it extends it. What this means in
 * practice is that this class will have access to all non-private
 * methods of JFrame.
 */
class MyFrame extends JFrame {

    public MyFrame() {
        this.setTitle("Programmering");
        this.setSize(300, 300);
        this.setVisible(true);
    }
}