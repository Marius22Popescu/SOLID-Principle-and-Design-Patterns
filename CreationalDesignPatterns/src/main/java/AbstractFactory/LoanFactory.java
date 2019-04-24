package AbstractFactory;

public class LoanFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
		
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		if (loan==null) {
			return null;
		}
		if (loan.equals("Home")) {
			
			return new HomeLoan();
		}
if (loan.equals("Business")) {
			
			return new BusinessLoan();
		}
if (loan.equals("Education")) {
	
	return new EducationLoan();
}
		return null;
	}
	
	

}
