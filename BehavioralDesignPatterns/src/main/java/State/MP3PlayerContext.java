package State;

public class MP3PlayerContext {
	
	MP3State state;
	
	MP3PlayerContext(){
		state = new StoppedState();
	}
	
	public void playMusic() {
		state.playMusic(this);
	}
	public void stopMusic() {
		state.stopMusic(this);
	}
	public void nextSong() {
		state.nextSong(this);
	}
	public void prevSong() {
		state.prevSong(this);
	}
	public MP3State getState() {
		return state;
	}
	public void setState(MP3State state) {
		this.state = state;
	}

}


