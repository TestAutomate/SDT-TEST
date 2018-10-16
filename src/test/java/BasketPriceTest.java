import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

import product.Product;

public class BasketPriceTest {
	
// Example 1:Filter is empty

	@Test
	public void Example1test() {

		
		
		BasketPriceCalculator cart = new BasketPriceCalculator();

		List<Product> productlist = new ArrayList<>();
		productlist.add(new Product(1.29, "Cheese"));
		productlist.add(new Product(1.29, "Cheese"));
		productlist.add(new Product(1.00, "Bread"));
		productlist.add(new Product(0.99, "jam"));

		Optional<String> filter = Optional.empty();

		System.out.println("Total Basket Price =" +cart.calculatePrice(productlist, filter));
	}
	
	
	//Example 2:Filter is "Cheese"
	@Test
	public void Example2test() {

		
		
		BasketPriceCalculator cart = new BasketPriceCalculator();

		List<Product> productlist = new ArrayList<>();
		productlist.add(new Product(1.29, "Cheese"));
		productlist.add(new Product(1.29, "Cheese"));
		productlist.add(new Product(1.00, "Bread"));
		productlist.add(new Product(0.99, "jam"));

		Optional<String> filter = Optional.of("Cheese");

		System.out.println("Total Basket Price =" + cart.calculatePrice(productlist, filter));
	}

}
