package Singleton;
//A class of which only a single instance can exist. Ensure that it creates only one instance of the object.
public class SingleObject {
	//Create load time
	private static SingleObject instance = new SingleObject();
	//Make the constructor private so that this class cannot be instantiated
	private SingleObject() {
		System.out.println("calling zero arg constructor");
	}
	//get the only object available
	public static SingleObject getInstance() {
		return instance;
	}
	public static SingleObject showMessage() {
		System.out.println("Accesing object with only one instance");
		return instance;
	}
}
