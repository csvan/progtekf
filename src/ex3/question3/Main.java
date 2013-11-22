package ex3.question3;

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 11/22/13
 * Time: 5:37 AM
 */
public class Main {

    public static void main(String[] args) {

        Grocery grocery = new Grocery();

        Product apple = new Product("Apple", 5.0, false);
        Product milk = new Product("Milk", 10.0, false);
        Product smokes = new Product("Marlboro Light", 25.00, true);

        grocery.addProduct(apple);
        grocery.addProduct(milk);

        grocery.getProductInfo("Apple");
        grocery.getProductInfo("Milk");

        grocery.getProductInfo("Marlboro Light");
        grocery.addProduct(smokes);
        grocery.getProductInfo("Marlboro Light");
    }
}
