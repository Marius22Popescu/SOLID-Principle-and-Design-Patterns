package Visitor;

public interface Visitor {
	
	public void visit(Car car);
	public void visit(Body body);
	public void visit(Engine engine);
	public void visit(Wheel wheel);

}
