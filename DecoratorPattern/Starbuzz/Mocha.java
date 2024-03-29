package Starbuzz;

import Starbuzz.Beverage.Size;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if(beverage.getSize() == Size.TALL) {
			cost += .20;
		} else if (beverage.getSize() == Size.GRANDE) {
			cost += .25;
		} else {
			cost += .30;
		}
		return cost;
	}
		
}
