package Addapter;

public class MainPattern {
	public static void main(String[] args) {
		CreditCard ref = new BankCustomer();
		ref.giveBankDetails();
		System.out.println(ref.getCreditCard());
		
	}

}
