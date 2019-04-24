package org.OpenClosePrinciple.DesignPatterns;
//Open for Extension closed for Modification. You should be able to extend a class’s behavior, without modifying it. How do we achieve this?
//Through abstractions. In order to be able to extend the behavior of a class without changing a single line of code, 
//we need to make abstractions.
public abstract class Product {
	
	private double basePrice;

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	
	public abstract double calTaxIncludePrice();
	
	
}
	
