package Observer1;

public class Person implements Observer{

	public void update(Subject subject) {
		Magazine magazine = (Magazine) subject;
		System.out.println("Person is notified about the current edition" + magazine.getCurrentEdition());
		
	}

}
