package Decorator;

public class Sugar extends BeverageDecorator {

	public Sugar(Beverage beverage) {
		super(beverage);
	}
	
	
	public double getCost() {
		return beverage.getCost();
	}


	public String getName() {
		return beverage.getName() +  " with sugar";
	}

}
