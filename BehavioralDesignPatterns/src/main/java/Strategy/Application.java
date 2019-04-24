package Strategy;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Strategy Encapsulates an algorithm inside a class. Define a family of algorithms, encapsulate each one, 
//and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

public class Application  {
	
	private JLabel nameLbl = new JLabel("Name:");
	private JLabel surnameLbl = new JLabel("Surname:");
	private JLabel professionLbl = new JLabel("Profession:");
	private JLabel yearLbl = new JLabel("Graduation Year:");
	private JLabel homePhoneLbl = new JLabel("Home Phone:");
	private JLabel workPhoneLbl = new JLabel("Work Phone:");
	private JLabel mobilePhoneLbl = new JLabel("Mobile Phone:");
	private JTextField nameTxt = new JTextField(15);
	private JTextField surnameTxt = new JTextField(15);
	private JTextField professionTxt = new JTextField(15);
	private MyTextField yearTxt = new MyTextField(new YearValidator(), 15);
	private MyTextField homePhoneTxt = new MyTextField(new PhoneValidator(), 15);
	private MyTextField workPhoneTxt = new MyTextField(new PhoneValidator(), 15);
	private MyTextField mobilePhoneTxt = new MyTextField(new PhoneValidator(), 15);
	private JButton applyBtn = new JButton("Apply");
	private JFrame frm = new JFrame();
	private JPanel centerPnl = new JPanel();
	private JPanel southPnl = new JPanel();
	
	public Application() {
		centerPnl.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = new Insets(10, 10, 10, 10);
		gc.gridx = 0;
		gc.gridy = 0;
		centerPnl.add(nameLbl, gc);
		gc.gridx = 1;
		gc.gridy = 0;
		centerPnl.add(nameTxt, gc);
		gc.gridx = 0;
		gc.gridy = 1;
		centerPnl.add(surnameLbl, gc);
		gc.gridx = 1;
		gc.gridy = 1;
		centerPnl.add(surnameTxt, gc);
		gc.gridx = 0;
		gc.gridy = 2;
		centerPnl.add(professionLbl, gc);
		gc.gridx = 1;
		gc.gridy = 2;
		centerPnl.add(professionTxt, gc);
		gc.gridx = 0;
		gc.gridy = 3;
		centerPnl.add(yearLbl, gc);
		gc.gridx = 1;
		gc.gridy = 3;
		centerPnl.add(yearTxt, gc);
		gc.gridx = 0;
		gc.gridy = 4;
		centerPnl.add(homePhoneLbl, gc);
		gc.gridx = 1;
		gc.gridy = 4;
		centerPnl.add(homePhoneTxt, gc);
		gc.gridx = 0;
		gc.gridy = 5;
		centerPnl.add(workPhoneLbl, gc);
		gc.gridx = 1;
		gc.gridy = 5;
		centerPnl.add(workPhoneTxt, gc);
		gc.gridx = 0;
		gc.gridy = 6;
		centerPnl.add(mobilePhoneLbl, gc);
		gc.gridx = 1;
		gc.gridy = 6;
		centerPnl.add(mobilePhoneTxt, gc);
		southPnl.add(applyBtn);

		
		applyBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String nameStr = nameTxt.getText();
				String surnameStr = surnameTxt.getText();
				String professionStr = professionTxt.getText();
				String yearStr = yearTxt.getText();
				String homePhoneStr = homePhoneTxt.getText();
				String workPhoneStr = workPhoneTxt.getText();
				String mobilePhoneStr = mobilePhoneTxt.getText();
				try{
					int year = Integer.parseInt(yearStr);
					if (year>2017){
						JOptionPane.showMessageDialog(null, "You cannot apply");
					}
				}catch(NumberFormatException x){
					JOptionPane.showMessageDialog(null, "Invalid Phone");
				}
				
				
				try{
					int homePhone = Integer.parseInt(homePhoneStr);
				}catch(NumberFormatException x){
					JOptionPane.showMessageDialog(null, "Invalid Phone");
				}
				
				try{
					int workPhone = Integer.parseInt(workPhoneStr);
				}catch(NumberFormatException x){
					JOptionPane.showMessageDialog(null, "Invalid Phone");
				}
				
				try{
					int mobilePhone = Integer.parseInt(mobilePhoneStr);
				}catch(NumberFormatException x){
					JOptionPane.showMessageDialog(null, "Invalid Phone");
				}
				
			}
		});
		frm.setLayout(new BorderLayout());
		frm.add(centerPnl, BorderLayout.CENTER);
		frm.add(southPnl, BorderLayout.SOUTH);
		frm.setVisible(true);
		frm.pack();

	}
	
	public static void main(String[] args) {
		Application gui = new Application();
	}

}
