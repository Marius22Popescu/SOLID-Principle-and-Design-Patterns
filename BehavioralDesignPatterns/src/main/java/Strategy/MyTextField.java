package Strategy;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class MyTextField extends JTextField implements FocusListener{
	
	private Validator validator;
	
	public MyTextField(Validator validator, int size){
		super(size);
		this.validator = validator;
		
		addFocusListener(this);
		
	}

	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void focusLost(FocusEvent e) {
		System.out.println("test");
		validator.validate(getText());
		
	}

}
