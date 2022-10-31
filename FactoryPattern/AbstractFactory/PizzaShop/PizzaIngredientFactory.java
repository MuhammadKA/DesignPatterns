package AbstractFactory.PizzaShop;

import AbstractFactory.PizzaShop.Ingredients.Cheese.Cheese;
import AbstractFactory.PizzaShop.Ingredients.Clams.Clams;
import AbstractFactory.PizzaShop.Ingredients.Dough.Dough;
import AbstractFactory.PizzaShop.Ingredients.Pepperoni.Pepperoni;
import AbstractFactory.PizzaShop.Ingredients.Sauce.Sauce;
import AbstractFactory.PizzaShop.Ingredients.Veggies.Veggies;

/* If we had common code to implement in each instance of factory, we could have made
 * this an abstract class instead... */

public interface PizzaIngredientFactory {
	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperroni();

	public Clams craeteClams();
}
