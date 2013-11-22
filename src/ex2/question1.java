package ex2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 11/14/13
 * Time: 7:45 PM
 */
public class question1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Skriv in ett nummer!");
        int nummer = scanner.nextInt();

        if (nummer > 0) {
            System.out.println(1);
        } else if (nummer == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
