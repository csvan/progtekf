package ex5.question1;

import javax.swing.*;

/**
 * Created by christopher on 1/30/14.
 * <p/>
 * This class HAS a JFrame, and thus uses the Composition pattern,
 * rather than Inheritance. In practice, this means that we can use
 * the JFrame according to its public API only - we cannot access
 * inner members for the frame, as we could in the Inheritance example.
 */
public class MyFrame2 {

    public MyFrame2() {
        JFrame frame = new JFrame();
        frame.setTitle("Programmering");
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

    }
}
