package Observer1;

public class Test {
	
	public static void main(String[] args) {
		Person p = new Person();
		Department d = new Department();
		Magazine magazine = new Magazine();
		magazine.registerObserver(p);
		magazine.registerObserver(d);
		magazine.setCurrentEdition(5);
		
	}

}
