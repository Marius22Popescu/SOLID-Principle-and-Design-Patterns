package State;

//State Alter an object's behavior when its state changes. Allow an object to alter its behavior when its internal 
//state changes. The object will appear to change its class.

public interface MP3State {
	public void playMusic(MP3PlayerContext context);
	public void stopMusic(MP3PlayerContext context);
	public void nextSong(MP3PlayerContext context);
	public void prevSong(MP3PlayerContext context);
	

}
