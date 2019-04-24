package org.LiskovSubstitutionPrinciple.DesignPatterns;

public class Car extends Vehicle{
	
	public void changeGear(Gear gear) {
		Gear actualGear=getGear();
		if(isMovingForwards (gear, actualGear)||isMovingBackwords (gear, actualGear)) {
			stop();
		}
		super.changeGear(gear);
	}
	
	private boolean isMovingBackwords(Gear gear, Gear actualGear) {
		return isMoving() && Gear.R.equals(actualGear) && Gear.D.equals(gear);
	}
	
	private boolean isMovingForwards(Gear gear, Gear actualGear) {
		return isMoving() && Gear.D.equals(actualGear) && Gear.R.equals(gear);
	}

}
