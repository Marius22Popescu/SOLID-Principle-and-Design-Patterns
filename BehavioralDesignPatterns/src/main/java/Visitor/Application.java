package Visitor;

public class Application {

	
	public static void main(String[] args) {
		Car car = new Car();
	    	Wheel frontRightWheel = new Wheel("Front Right");
	    	Wheel frontLeftWheel = new Wheel("Front Left");
	    	Wheel backRightWheel = new Wheel("Back Right");
	    	Wheel backLeftWheel = new Wheel("Back Left");
	    	Body body = new Body(1.2);
	    	Engine engine = new Engine("#12AFGSD35454");
	
	    	car.addPart(frontRightWheel);
	    	car.addPart(frontLeftWheel);
	    	car.addPart(backRightWheel);
	    	car.addPart(backLeftWheel);
	    	car.addPart(body);
	    	car.addPart(engine);
	    	
	    	CarInspectionVisitor visitor = new CarInspectionVisitor();
	    	visitor.visit(car);

	}
}
