package AbstractFactory;

public class GenericFactory {
	
	public static AbstractFactory getFactory(String factory) {
		if (factory.equalsIgnoreCase("Bank")) {
			return new BankFactory();
			}else if(factory.equalsIgnoreCase("Loan")) {
				return new LoanFactory();
			}
		return null;
	}

}
