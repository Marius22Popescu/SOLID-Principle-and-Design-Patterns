package org.InterfaceSegregationPrinciple;

public abstract class Vehicle implements Engine{
	private boolean engineRunning;
	
	public boolean isEngineRunning() {
		return engineRunning;
	}
	
	public void startEngine() {
		engineRunning=true;
	}
	public void stopEngine() {
		engineRunning=false;
	}
}
