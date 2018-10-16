# Discovery SDET Test
 
## What you need to do

The task is to implement a basket price calculator. It also takes an optional filter, if this filter is used then it will only total up product names that match the filter

### Product.java: 

A POJO that represents a product with a price and a name. This is already implemented for you.

### BasketPriceCalculator.java: 

This class has a method called calculatePrice() which takes in a list of products and an optional product filter.

#### Example 1:

Products List is:

|Product|Price|
|-------|-----|
|Cheese|1.29|
|Cheese|1.29|
|Bread|1.00|
|Jam|0.99|

And Filter is empty


Total Basket Price = 4.57

#### Example 2:

Products List is:

|Product|Price|
|-------|-----|
|Cheese|1.29|
|Cheese|1.29|
|Bread|1.00|
|Jam|0.99|

And Filter is "Cheese"


Total Basket Price = 2.58

## Testing
In order to complete this task you should implement the BasketPriceCalculator against unit tests.