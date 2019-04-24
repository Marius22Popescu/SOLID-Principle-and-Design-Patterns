package Prototype;
//A fully initialized instance to be copied or cloned. Specify the kinds of objects to create using a prototypical instance, 
//and create new objects from the 'skeleton' of an existing object, thus boosting performance and keeping memory 
//footprints to a minimum.
public abstract class Shape implements Cloneable{
	private String id;
	protected String type;
	abstract void draw();

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
			
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
