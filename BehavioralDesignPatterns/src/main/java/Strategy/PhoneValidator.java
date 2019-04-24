package Strategy;

import javax.swing.JOptionPane;

public class PhoneValidator implements Validator {

	public void validate(String phoneStr) {
		try{
			int phone = Integer.parseInt(phoneStr);
		}catch(NumberFormatException x){
			JOptionPane.showMessageDialog(null, "Invalid Phone");
		}
		
	}

}
