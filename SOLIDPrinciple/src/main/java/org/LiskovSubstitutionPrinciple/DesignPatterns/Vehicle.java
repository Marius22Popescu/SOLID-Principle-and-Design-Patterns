package org.LiskovSubstitutionPrinciple.DesignPatterns;
//Derived classes must be substitutable for their base classes. Replace object of parent with object of child without breaking the code.


public class Vehicle {
	
	private boolean isMoving;
	private Gear gear;
	
	public void move() {
		isMoving=true;
	}
	
	public void stop() {
		isMoving=false;
	}
	public boolean isMoving() {
		return isMoving;
	}

	public Gear getGear() {
		return gear;
	}
	
	public void changeGear(final Gear gear) {
		this.gear=gear;
	}
	
}
