package FactoryMethod.PizzaShop;

/* Here we create a framework that ties the store and the pizza creation together, 
 * yet still allow things to remain flexible */

/* PizzaStore is a high-level component because its behavior is defined in terms of pizzas. 
 * It creates all the different pizza objects, and prepares, bakes, cuts, and boxes them, 
 * while the pizzas it uses are low-level components */

public abstract class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza pizza;

		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	// This method will handle all variations of different stores.
	// This is the factory method.
	// (Different styles of pizza)
	protected abstract Pizza createPizza(String type);
}
