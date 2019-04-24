package AbstractFactory;

//Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

public abstract class AbstractFactory {
	public abstract Bank getBank(String bank);
	
	public abstract Loan getLoan(String loan);
	
	}


