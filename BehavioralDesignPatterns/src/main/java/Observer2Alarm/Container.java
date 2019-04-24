package Observer2Alarm;

import java.util.ArrayList;
import java.util.Vector;

public class Container implements Subject {

	private double temperature = 20.4;
	private ArrayList observers = new ArrayList();

	
	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
		notifyObservers();
	}

	public void registerObserver(Observer obs) {
		observers.add(obs);
		
	}

	public void removeObserver(Observer obs) {
		observers.remove(obs);
		
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer obs = (Observer) observers.get(i);
			obs.update(this);
		}
		
	}


}
