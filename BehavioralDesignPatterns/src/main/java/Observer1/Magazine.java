package Observer1;

import java.util.ArrayList;

public class Magazine implements Subject{
	
	private String title;
	private String publisher;
	private int currentEdition;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		notifyObservers();
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
		
	}

	public int getCurrentEdition() {
		return currentEdition;
	}

	public void setCurrentEdition(int currentEdition) {
		this.currentEdition = currentEdition;
		notifyObservers();
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}

	private ArrayList<Observer> observers;
	
	public Magazine() {
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer obs) {
		observers.add(obs);
	}

	public void removeObserver(Observer obs) {
		observers.remove(obs);
	}

	public void notifyObservers() {
		for(Observer o:observers) {
			o.update(this);
		}
	}

}
