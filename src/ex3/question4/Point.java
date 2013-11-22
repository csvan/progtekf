package ex3.question4;

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 11/22/13
 * Time: 6:07 AM
 */
public class Point {

    private double x_cord = 0.0;
    private double y_cord = 0.0;

    public Point(double x_cord, double y_cord) {
        this.x_cord = x_cord;
        this.y_cord = y_cord;
    }

    public Point() {
    }

    public double getX_cord() {
        return x_cord;
    }

    public void setX_cord(double x_cord) {
        this.x_cord = x_cord;
    }

    public double getY_cord() {
        return y_cord;
    }

    public void setY_cord(double y_cord) {
        this.y_cord = y_cord;
    }
}
