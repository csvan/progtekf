package ex2;

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 11/14/13
 * Time: 10:13 PM
 */
public class question6 {

    public static void main(String[] args) {

        System.out.println(toString4(127));

    }

    public static String toString4(int number) {

        String num = Integer.toString(number);

        int dots = 4 - num.length();
        for (int i = 0; i < dots; i++) {
            num = "." + num;
        }

        return num;
    }

    public static String toString(int i, int n) {

        String num = Integer.toString(i);

        int dots = n - num.length();
        for (int c = 0; c < dots; c++) {
            num = "." + num;
        }

        return num;
    }
}
