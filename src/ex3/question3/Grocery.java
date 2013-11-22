package ex3.question3;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 11/22/13
 * Time: 5:31 AM
 */
public class Grocery {

    ArrayList<Product> products = new ArrayList<Product>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void getProductInfo(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println("Product name: " + product.getName());
                System.out.println("Product price: " + product.getPrice());
                System.out.println("VAT: " + product.getVat());
                return;
            }
        }

        System.out.println("Could not find product: " + name);
    }
}
