package ex3.question1;

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 11/21/13
 * Time: 10:24 PM
 */
public class Welcome {

    public static void main(String[] args) {

        Host drLisa = new Host();

        drLisa.sayWelcome();
        System.out.println("resten av programmet");
        drLisa.sayGoodbye();
    }
}