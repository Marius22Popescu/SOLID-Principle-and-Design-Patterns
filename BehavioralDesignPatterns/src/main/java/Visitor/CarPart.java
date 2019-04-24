package Visitor;

public interface CarPart {
	
	public double getPrice();

	public void accept(Visitor visitor);
}
