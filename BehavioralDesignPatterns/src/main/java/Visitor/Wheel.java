package Visitor;

public class Wheel implements CarPart{

	private String name;
	
	public Wheel(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public double getPrice() {
		return 400;
	}

	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
