package Visitor;

public class Body implements CarPart{

	private double weight;
	public Body(double weight) {
		this.weight =  weight;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return 10000;
	}
	
	public void accept(Visitor visitor) {
		//visitor.visit(this);
	}

}
