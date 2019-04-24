package Addapter;
//Match interfaces of different classes. Convert the interface of a class into another interface clients expect. 
//An adapter lets classes work together that could not otherwise because of incompatible interfaces.
import java.util.Scanner;

public class BankCustomer extends BankDetails implements CreditCard{
	public void giveBankDetails() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the account holder name");
			String customerName = sc.nextLine();
			System.out.println("\n");
			
			System.out.println("Enter the account number");
			int accountNo = Integer.parseInt(sc.nextLine());
			System.out.println("\n");
			
			System.out.println("Enter the bank name");
			String bankName = sc.nextLine();
			setAccNumber(accountNo);
			setAcctHolderName(customerName);
			setBankName(bankName);
			System.out.println("\n");
			
		}catch(Exception e) {e.printStackTrace();}
	}

	public String getCreditCard() {
		int accNo = getAccNumber();
		String accHolderName = getAcctHolderName();
		String bname = getBankName();
		
		return ("The account number "+ accNo + " of "+ accHolderName+" in "+ bname+" bank is valid and autenticated for issuing the credit card");
	}
}
