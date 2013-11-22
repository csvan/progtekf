package ex2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 11/14/13
 * Time: 8:04 PM
 */
public class question3 {

    private static String vowels = "aoeiyuåäö";

    static boolean isVowel(char ch) {

        for (int i = 0; i < vowels.length(); i++) {
            if (ch == vowels.charAt(i)) {
                return true;
            }
        }

        return false;
    }

    static int nbrOfVowels(String str) {

        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Skriv en bokstav för att se om det är en vokal");
            char ch = scanner.next().charAt(0);
        }
    }
}
