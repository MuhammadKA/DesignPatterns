package AbstractFactory.PizzaShop;

import AbstractFactory.PizzaShop.Ingredients.Cheese.Cheese;
import AbstractFactory.PizzaShop.Ingredients.Cheese.MozzerellaCheeese;
import AbstractFactory.PizzaShop.Ingredients.Clams.Clams;
import AbstractFactory.PizzaShop.Ingredients.Clams.FrozenClams;
import AbstractFactory.PizzaShop.Ingredients.Dough.Dough;
import AbstractFactory.PizzaShop.Ingredients.Dough.ThickCrustDough;
import AbstractFactory.PizzaShop.Ingredients.Pepperoni.Pepperoni;
import AbstractFactory.PizzaShop.Ingredients.Pepperoni.SlicedPepperoni;
import AbstractFactory.PizzaShop.Ingredients.Sauce.PlumTomatoSauce;
import AbstractFactory.PizzaShop.Ingredients.Sauce.Sauce;
import AbstractFactory.PizzaShop.Ingredients.Veggies.BlackOlives;
import AbstractFactory.PizzaShop.Ingredients.Veggies.EggPlant;
import AbstractFactory.PizzaShop.Ingredients.Veggies.Spinach;
import AbstractFactory.PizzaShop.Ingredients.Veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	/*
	 * For each ingredient in the ingredient family, we create the New York version.
	 */

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzerellaCheeese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), new Spinach(), new EggPlant() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperroni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams craeteClams() {
		return new FrozenClams();
	}
}
