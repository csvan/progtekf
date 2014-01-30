package ex5.question6;

import javax.swing.*;
import java.awt.*;

/**
 * Created by christopher on 1/30/14.
 * <p/>
 * Notice that our class IS a JFrame. We are creating a custom frame tailored
 * for function plotting, rather than reusing a basic JFrame.
 */
public class DrawFunction extends JFrame {

    public DrawFunction() throws HeadlessException {

        /*
         * We use a standard border layout, since we will only need
         * to consider a single component.
         */
        setLayout(new BorderLayout());

        /*
         * Here, we create and attach the actual "drawing surface to
         * the frame. The second parameter, BorderLayout.CENTER, tells
         * the system that the component should be placed at the center
         * of the frames layout.
         */
        add(new DrawingBoard(), BorderLayout.CENTER);

        /*
         * This defines what action to take when we close the frame (by
         * clicking the "X" in the top-right corner, if we are on a
         * Windows machine, for example). In our case, we shut down the
         * frame when it is closes.
         */
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*
         * Set the title to appear in the top-bar of the frame.
         */
        setTitle("Draw");
    }

    /**
     * This will be our "drawing board", where we do the actual plotting.
     * Our board is a JPanel, which is a multi-purpose component which
     * can be used to hold text, graphics, or other components.
     */
    class DrawingBoard extends JPanel {

        /**
         * The function which we will be plotting. Could easily be replaced by an
         * interface like we did in previous exercises.
         *
         * @param x
         * @return
         */
        private double f(double x) {
            return x * x;
        }

        @Override
        protected void paintComponent(final Graphics g) {
            super.paintComponent(g);

            /*
             * First, we draw the arrows on our chart (to give it that nice, math-ish feeling).
             */
            g.drawLine(390, 200, 370, 190);
            g.drawLine(390, 200, 370, 210);
            g.drawLine(200, 30, 190, 50);
            g.drawLine(200, 30, 210, 50);

            /*
             * Draw the X and Y axes
             */
            g.drawLine(10, 200, 390, 200);
            g.drawLine(200, 30, 200, 390);

            /*
             * Draw the labels for the axes
             */
            g.drawString("X", 390, 170);
            g.drawString("Y", 220, 40);

            /*
             * To do the actual drawing, we use a Polygon.
             */
            Polygon polygon = new Polygon();

            for (int x = -40; x <= 40; x++) {
                polygon.addPoint(x + 200, 200 - (int) ((0.1) * f(x)));
            }

            g.drawPolyline(polygon.xpoints, polygon.ypoints, polygon.npoints);
        }
    }

    public static void main(String[] args) {
        final int FRAME_WIDTH = 400;
        final int FRAME_HEIGHT = 400;
        DrawFunction frame = new DrawFunction();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setVisible(true);
    }
}
