package Decorator;
//Decorator Add responsibilities to objects dynamically. Attach additional responsibilities to an object dynamically 
//keeping the same interface. Decorators provide a flexible alternative to subclassing for extending functionality.
public abstract class BeverageDecorator implements Beverage{

	protected Beverage beverage;
	
	public BeverageDecorator(Beverage beverage) {
		this.beverage = beverage;
	}
	
}
