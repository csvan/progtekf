package ex2;

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 11/14/13
 * Time: 9:05 PM
 */
public class question4 {

    public static int indexOfMaxElem(int[] vector) {

        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
                index = i;
            }
        }
        return index;
    }

    public static int maxElement(int[] vector) {

        int index = indexOfMaxElem(vector);

        return vector[index];
    }

    public static void main(String[] args) {

        int[] vector = new int[]{1, 43, 23, 55, 6, 21};

        System.out.println(indexOfMaxElem(vector));
        System.out.println(maxElement(vector));
    }
}
