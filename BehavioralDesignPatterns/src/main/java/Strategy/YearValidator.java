package Strategy;

import javax.swing.JOptionPane;

public class YearValidator implements Validator{

	public void validate(String yearStr) {
		int year = Integer.parseInt(yearStr);
		if(year>2017)
			JOptionPane.showMessageDialog(null, "You cannot apply");
		
	}

}
