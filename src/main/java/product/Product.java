package product;


/**
 * Represents a product with a price and a name
 */
public class Product {
    private double price;
    private String name;

    /**
     * @param price The price of the product
     * @param name The name of the product
     */
    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }


    /**
     * @return the price of the product
     */
    public double getPrice() {
        return price;
    }


    /**
     * @return the name of the product
     */
    public String getName() {
        return name;
    }
}
