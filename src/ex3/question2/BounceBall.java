package ex3.question2;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 11/22/13
 * Time: 5:12 AM
 */
public class BounceBall {
    private Color col;

    public BounceBall() {
    }

    public void setCol(Color c) {
        col = c;
    }

    public static void main(String[] arg) {
        BounceBall boing = new BounceBall();
        boing.setCol(Color.pink);
    }
}