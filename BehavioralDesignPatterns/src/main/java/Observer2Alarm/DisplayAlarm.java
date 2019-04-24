package Observer2Alarm;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DisplayAlarm extends JPanel implements Observer{
	private JLabel tempLbl = new JLabel();
	public DisplayAlarm() {
		add(tempLbl);
		Font f = new Font("Arial",Font.BOLD, 20);
		tempLbl.setFont(f);
	}
	
	public void update(Subject subject) {
		Container container = (Container) subject;
		double temperature = container.getTemperature();
		if ((container.getTemperature()>60) && (temperature<80)){
			setBackground(Color.ORANGE);
		}else if (temperature>80){
			setBackground(Color.RED);		
		}else{
			setBackground(Color.GREEN);
		}
		DecimalFormat df = new DecimalFormat("#.##");

		tempLbl.setText(df.format(temperature));
	}

}
