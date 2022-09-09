package SimUDuckApp;

import FlyBehavior.FlyBehavior;
import QuackBehavior.QuackBehavior;

public class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
		
	public void performQuack() {
		// the duck object delegates the behavior to the object referenced by quackBehavior
		quackBehavior.quack();
	}
	
	public void performFly() {
		// the duck object delegates the behavior to the object referenced by flyBehavior
		flyBehavior.fly();
	}
	
	public void setFlyBehavior (FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior (QuackBehavior qb) {
		quackBehavior = qb;
	}
}
