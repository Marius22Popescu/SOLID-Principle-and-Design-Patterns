package Decorator;

public class Chocolate extends BeverageDecorator {
	
	public Chocolate(Beverage beverage) {
		super(beverage);
	}
	
	
	public double getCost() {
		return beverage.getCost() + 15;
	}

	
	public String getName() {
		return beverage.getName() + " with chocolate";
	}

}
