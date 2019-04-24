package org.InterfaceSegregationPrinciple;

public class Dorne extends Vehicle implements Camera{
	
	private boolean cameraOn;
	
	private boolean isCameraOn() {
		return cameraOn;
	}
	
	
	public void turnCameraOn() {
		cameraOn=true;
	}
	
	public void turnCameraOff() {
		cameraOn=false;
	}
	
}
