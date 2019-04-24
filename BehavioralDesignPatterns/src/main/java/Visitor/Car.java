package Visitor;

import java.util.ArrayList;

public class Car implements CarPart{

	private ArrayList<CarPart> parts;
	
	public Car(){
		parts = new ArrayList<CarPart>();
	}
	
	public void addPart(CarPart part) {
		parts.add(part);
	}
	
	public double getPrice() {
		double total = 0;
		for(CarPart part:parts) {
			total += part.getPrice();
		}
		return total;
	}
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public ArrayList<CarPart> getParts() {
		return parts;
	}
}
