package ex3.question3;

/**
 * Created with IntelliJ IDEA.
 * User: christopher
 * Date: 11/22/13
 * Time: 5:16 AM
 */
public class Product {
    private String name = "";
    private double price = 0.0;
    private boolean vat = true;

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, double price, boolean vat) {
        this.name = name;
        this.price = price;
        this.vat = vat;
    }

    public boolean getVat() {
        return vat;
    }

    public void setVat(boolean vat) {
        this.vat = vat;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price * 1.08;
    }
}

