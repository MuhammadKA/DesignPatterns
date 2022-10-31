package AbstractFactory.PizzaShop;

import AbstractFactory.PizzaShop.Ingredients.Cheese.Cheese;
import AbstractFactory.PizzaShop.Ingredients.Clams.Clams;
import AbstractFactory.PizzaShop.Ingredients.Dough.Dough;
import AbstractFactory.PizzaShop.Ingredients.Pepperoni.Pepperoni;
import AbstractFactory.PizzaShop.Ingredients.Sauce.Sauce;
import AbstractFactory.PizzaShop.Ingredients.Veggies.Veggies;


public abstract class Pizza {
	String name;

	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	// We've now made the prepare method abstract. This is where we are going to
	// collect the ingredients needed for the pizza, which will come from the
	// ingredient factory
	abstract void prepare();
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		// code to print pizza here
		return "";
	}
}
