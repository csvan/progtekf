package ex5.question2;

import javax.swing.*;

public class MyMultiFrame2 {
    private static int X_POSITION = 100;
    private static int Y_POSITION = 100;

    public MyMultiFrame2() {
        JFrame frame = new JFrame();
        frame.setTitle("Programmering");
        frame.setSize(300, 300);

        frame.setLocation(X_POSITION, Y_POSITION);
        X_POSITION += 50;
        Y_POSITION += 50;

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        for (int x = 0; x < 10; x++) {
            new MyMultiFrame2();
        }
    }
}
