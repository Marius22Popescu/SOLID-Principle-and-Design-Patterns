package Visitor;

//Visitor lets a new operation be defined without changing the classes of the elements on which it operates.

public class CarInspectionVisitor implements Visitor{

	public void visit(Wheel wheel) {      
        System.out.println("<<<<");
        System.out.println("Visiting "+ wheel.getName() + "wheel");
        System.out.println(wheel.getName() + " is ok...");
        System.out.println(">>>>\n");
    }
    public void visit(Engine engine) {
        System.out.println("<<<<");
        System.out.println("Visiting engine");
        System.out.println("Engine " + engine.getEngine_name());
        System.out.println("Engine is ok...");
        System.out.println(">>>>\n");
    }
    public void visit(Body body) {
        System.out.println("<<<<");
        System.out.println("Visiting body");
        System.out.println("Weight:" + body.getWeight());    
        System.out.println("Body is ok...");
        System.out.println(">>>>\n");
    }
 
    public void visit(Car car) {
        System.out.println("Visiting car\n");
        for(CarPart p:car.getParts()) {
        	    p.accept(this);
        }
        System.out.println(">>>>");
        System.out.println("Inspection is done.");
    }

}
