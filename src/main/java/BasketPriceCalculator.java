import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import product.Product;



/**
 * A class that takes in a list of products and a discounter object which will
 * then return the total amount that a customer has to pay
 */
public class BasketPriceCalculator {

	/**
	 * @param products
	 *            The list of products the customer is buying
	 * @param filter
	 *            Filters the name of the products being totalled up
	 * @return A total basket price
	 */
	public double calculatePrice(List<Product> products, Optional<String> filter) {
		double total = 0;
		Iterator<Product> listproduct = products.iterator();

		// Filter present Verification
		if (filter.isPresent()) {

			while (listproduct.hasNext()) {
				Product productobj = listproduct.next();
				boolean isEqual = productobj.getName().equals(filter.get());
				//Verifying  for Filter is "Cheese"
				if (isEqual == true) {

					total += productobj.getPrice();

				}

			}

		} else {

			while (listproduct.hasNext()) {
				Product productobj = listproduct.next();

				total += productobj.getPrice();

			}
		}
		
		return total;
	}

}
