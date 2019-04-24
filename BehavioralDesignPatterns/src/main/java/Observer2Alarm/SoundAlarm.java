package Observer2Alarm;


import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SoundAlarm implements Observer{

	public void update(Subject subject) {
		Container container = (Container) subject;

		double temperature = container.getTemperature();
		try {
				if ((temperature>60) && (temperature<80)){
	
					AudioInputStream stream = AudioSystem.getAudioInputStream(new File("somethingwrong.wav"));
					
					AudioFormat format = stream.getFormat();
					
					DataLine.Info info = new DataLine.Info(Clip.class, stream.getFormat());
					
					Clip clip = (Clip) AudioSystem.getLine(info);
					
					clip.open(stream);
					
					clip.start();
				}else if ((temperature>80)){
					AudioInputStream stream = AudioSystem.getAudioInputStream(new File("alarm.wav"));
					
					AudioFormat format = stream.getFormat();
					
					DataLine.Info info = new DataLine.Info(Clip.class, stream.getFormat());
					
					Clip clip = (Clip) AudioSystem.getLine(info);
					
					clip.open(stream);
					
					clip.start();
					
				} 
			}catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 
		

		
	}

}
