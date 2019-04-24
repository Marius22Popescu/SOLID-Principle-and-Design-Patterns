package Facade;
//Facade defines a higher-level interface that makes the subsystem easier to use.
//It is a single class that represents an entire subsystem. 

public class Factory {
	private Laptop dell;
	private Laptop lenovo;
	
	public Factory() {
		dell = new Dell();
		lenovo = new Lenovo();
	}
	
	public void dellPOS() {
		dell.modelNo();
		dell.price();
		}
	
	public void lenovoPOS() {
		dell.modelNo();
		dell.price();
		}

}
