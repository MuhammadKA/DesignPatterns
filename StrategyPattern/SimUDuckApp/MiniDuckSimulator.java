package SimUDuckApp;

import FlyBehavior.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		// we couldn't have done that if the implementation is living inside the Duck class.
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
	}

}
