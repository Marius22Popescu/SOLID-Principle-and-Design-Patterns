package org.InterfaceSegregationPrinciple;

// Clients should not be forced to implement interfaces they do not use. Make fine grained interfaces that are client specific. 
// In other words, it is better to have many smaller interfaces, than fewer, fatter interfaces

public interface Camera {
	public void turnCameraOn();
	public void turnCameraOff();

}
