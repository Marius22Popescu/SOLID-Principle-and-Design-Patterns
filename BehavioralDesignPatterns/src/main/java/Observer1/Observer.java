package Observer1;
//A way of notifying change to a number of classes. Define a one-to-many dependency between objects where 
//a state change in one object, all its dependents are notified and updated automatically.
public interface Observer {
	
	public void update(Subject subject);

}
