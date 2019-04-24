package Observer2Alarm;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestContainer {
	private JFrame frm = new JFrame();
	private JPanel pnl = new JPanel();
	private JButton tempBtn = new JButton("Increase Temperature");	
	private Container container = new Container();
	private DisplayAlarm displayAlarm = new DisplayAlarm();
	private SoundAlarm soundAlarm = new SoundAlarm();
	
	public TestContainer() {		
		container.registerObserver(displayAlarm);
		container.registerObserver(soundAlarm);
		
		tempBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				Random generator = new Random();
				container.setTemperature(container.getTemperature()+generator.nextDouble()*10);
				
			}
		});
		
		pnl.add(tempBtn);
		frm.setLayout(new GridLayout(2,1));
		frm.add(pnl);
		frm.add(displayAlarm);
		frm.setVisible(true);
		frm.pack();
	}
	
	public static void main(String[] args) {
		TestContainer container = new TestContainer();
	}

}
