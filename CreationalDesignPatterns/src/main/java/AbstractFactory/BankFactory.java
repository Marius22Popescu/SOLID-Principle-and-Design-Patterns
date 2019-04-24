package AbstractFactory;

public class BankFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
		if (bank==null) {
			return null;
		}
		if (bank.equals("PNC")) {
			return new PNC();
			
		}
		if (bank.equals("BOA")) {
			return new BOA();
			
		}
		if (bank.equals("Citizen")) {
			return new Citizen();
			
		}
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		return null;
	}
	
	

}
