package SimUDuckApp;

import FlyBehavior.FlyWithWings;
import QuackBehavior.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		// initialize with concrete implementation class
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm real Mallard duck");
	}
}
