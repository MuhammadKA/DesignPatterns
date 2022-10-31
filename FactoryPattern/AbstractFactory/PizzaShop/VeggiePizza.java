package AbstractFactory.PizzaShop;

public class VeggiePizza extends Pizza{

	PizzaIngredientFactory ingredientFactory;

	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	/*
	 * The ingredients produced depend on which factory we're using. The Pizza class
	 * doesn't care; it knows how to make pizzas. Now, it's decoupled from the
	 * differences in regional ingredients and can be easily reused when there are
	 * factories for different regions.
	 */
	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}
