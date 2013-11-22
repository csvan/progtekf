package ex3.question1;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 11/21/13
 * Time: 10:26 PM
 */
public class Host {

    private String namn = "";

    public void sayWelcome() {
        System.out.println("Välkommen! Vad heter du ?");
        namn = new Scanner(System.in).nextLine();
    } // end sayWelcome

    public void sayGoodbye() {
        System.out.println("Hej då " + namn + ".");
    } // end sayGoodbye
} // end Host

