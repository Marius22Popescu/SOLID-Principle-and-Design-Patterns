package Decorator;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CoffeShop extends JFrame {
	
	private JLabel beverageLbl = new JLabel("Select a beverage:");
	private String[] beverages = {"Tea","Coffee"};
	private JComboBox beverageCombo = new JComboBox(beverages);
	private JCheckBox sugarCBox = new JCheckBox("Sugar");
	private JCheckBox chocolateCBox = new JCheckBox("Chocolate");
	private JButton costBtn = new JButton("Cost");
	private JLabel totalLbl = new JLabel("Total:");
	private JTextField totalTxt = new JTextField(30);
	private JTextArea ingredients = new JTextArea(5,30);
	
	private JPanel centerPnl = new JPanel();
	private JPanel southPnl = new JPanel();
	private double tea = 1;
	private double coffee = 3;
	private double chocolate = 1;
	public CoffeShop() {
		setTitle("CS Coffee Shop...");
		Color color = new Color(255,100,5);
		centerPnl.setBackground(color);
		sugarCBox.setBackground(color);
		centerPnl.setLayout(new GridBagLayout());
		GridBagConstraints gc = new GridBagConstraints();
		gc.anchor = GridBagConstraints.WEST;
		gc.insets = new Insets(5, 5, 5, 5);
		gc.gridx = 0;
		gc.gridy = 0;
		centerPnl.add(beverageLbl, gc);
		gc.gridx = 1;
		gc.gridy = 0;
		centerPnl.add(beverageCombo, gc);
		gc.gridx = 1;
		gc.gridy = 1;
		centerPnl.add(sugarCBox, gc);
		gc.gridx = 0;
		gc.gridy = 1;
		centerPnl.add(chocolateCBox, gc);
		gc.gridx = 0;
		gc.gridy = 2;
		centerPnl.add(costBtn, gc);
		gc.gridx = 0;
		gc.gridy = 3;
		centerPnl.add(totalLbl, gc);
		gc.gridx = 0;
		gc.gridy = 4;
		gc.gridwidth = 3;
		centerPnl.add(totalTxt, gc);
		gc.gridx = 0;
		gc.gridy = 5;
		gc.gridwidth = 3;
		centerPnl.add(new JScrollPane(ingredients), gc);
		
		costBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String selectedBeverage = (String) beverageCombo.getSelectedItem();
				double total = 0.0;
				String text = "";
				Beverage beverage = null;
				
				if(selectedBeverage.equals("Tea")){
					beverage = new Tea();
					
				}else if(selectedBeverage.equals("Coffee")){
					beverage = new Coffee();				
				}
				if(chocolateCBox.isSelected()){
					beverage = new Chocolate(beverage);
				}
				if(sugarCBox.isSelected()){
 					beverage = new Sugar(beverage);
				}
				total = beverage.getCost();
				text = beverage.getName();
				DecimalFormat df = new DecimalFormat("#.##");
				totalTxt.setText(df.format(total)+"");
				ingredients.setText(text);
				
			}
		});
		
		add(centerPnl, BorderLayout.CENTER);
		add(southPnl, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();		
	
	}
	
	public static void main(String[] args) {
		CoffeShop shop = new CoffeShop();
	}

}
