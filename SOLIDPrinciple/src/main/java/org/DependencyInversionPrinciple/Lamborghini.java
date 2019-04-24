package org.DependencyInversionPrinciple;

public class Lamborghini implements Vehicle{
	
	private final int maxFuel;
	private int remainingFuel;
	private int horsepower;
	
	public Lamborghini (final int maxFuel) {
		this.maxFuel=maxFuel;
		remainingFuel=maxFuel;
	}
	
	public void accelerate() {
		horsepower++;
		remainingFuel--;
	}

}
