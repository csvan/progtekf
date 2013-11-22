package ex2;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 11/14/13
 * Time: 9:47 PM
 */
public class question5 {

    public static int[] arraySqr(int[] arr) {

        int[] newVector = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newVector[i] = arr[i] * arr[i];
        }
        return newVector;
    }

    public static void main(String[] args) {

        int[] vector = new int[]{-1, 0, 1, 2, 3, 4, 5};

        System.out.println("original: " + Arrays.toString(vector));
        System.out.println("new: " + Arrays.toString(arraySqr(vector)));
    }
}
