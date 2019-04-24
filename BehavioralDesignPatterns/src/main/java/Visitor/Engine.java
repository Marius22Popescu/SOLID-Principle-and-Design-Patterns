package Visitor;

public class Engine implements CarPart{
	private String engine_name;

	public Engine(String engine_name) {
		this.engine_name = engine_name;
	}

	public String getEngine_name() {
		return engine_name;
	}

	public void setEngine_name(String engine_name) {
		this.engine_name = engine_name;
	}

	
	public double getPrice() {
		return 15000 ;
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
