package ex5.question2;

import javax.swing.*;

/**
 * This custom JFrame places each new instance of itself
 * on a new area of the screen.
 */
class MyMultiFrame extends JFrame {

    /*
     * We make use of these static (i.e. JVM-global) variables
     * in order to indicate what position the next frame should take.
     *
     * Note that we do not pay any special respect to upper bounds here -
     * if we create enough frames during a single run, we will eventually
     * end up placing them beyond the physical constraints of the users
     * monitor, effectively rendering them invisible after creation.
     */
    private static int X_POSITION = 100;
    private static int Y_POSITION = 100;

    public MyMultiFrame() {
        this.setTitle("Programmering");
        this.setSize(300, 300);

        // Set the location, and then increase the coordinates.
        this.setLocation(X_POSITION, Y_POSITION);
        X_POSITION += 50;
        Y_POSITION += 50;

        this.setVisible(true);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new MyMultiFrame();
        }
    }
}