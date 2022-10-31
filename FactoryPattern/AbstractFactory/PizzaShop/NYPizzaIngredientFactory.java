package AbstractFactory.PizzaShop;

import AbstractFactory.PizzaShop.Ingredients.Cheese.Cheese;
import AbstractFactory.PizzaShop.Ingredients.Cheese.ReggianoCheese;
import AbstractFactory.PizzaShop.Ingredients.Clams.Clams;
import AbstractFactory.PizzaShop.Ingredients.Clams.FreshClams;
import AbstractFactory.PizzaShop.Ingredients.Dough.Dough;
import AbstractFactory.PizzaShop.Ingredients.Dough.ThinCrustDough;
import AbstractFactory.PizzaShop.Ingredients.Pepperoni.Pepperoni;
import AbstractFactory.PizzaShop.Ingredients.Pepperoni.SlicedPepperoni;
import AbstractFactory.PizzaShop.Ingredients.Sauce.MarinaraSauce;
import AbstractFactory.PizzaShop.Ingredients.Sauce.Sauce;
import AbstractFactory.PizzaShop.Ingredients.Veggies.Garlic;
import AbstractFactory.PizzaShop.Ingredients.Veggies.Mashroom;
import AbstractFactory.PizzaShop.Ingredients.Veggies.Onion;
import AbstractFactory.PizzaShop.Ingredients.Veggies.RedPepper;
import AbstractFactory.PizzaShop.Ingredients.Veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	/*
	 * For each ingredient in the ingredient family, we create the New York version.
	 */
	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mashroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperroni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams craeteClams() {
		return new FreshClams();
	}

}
