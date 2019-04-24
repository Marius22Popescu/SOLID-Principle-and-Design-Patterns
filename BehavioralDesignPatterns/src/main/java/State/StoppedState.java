package State;

public class StoppedState implements MP3State {

	public void playMusic(MP3PlayerContext context) {
		System.out.println("Started playing the music");
		context.setState(new PlayingState());
		
	}

	public void stopMusic(MP3PlayerContext context) {
		//do nothing
	}

	public void nextSong(MP3PlayerContext context) {
		//do nothing
	}

	public void prevSong(MP3PlayerContext context) {
		//do nothing
	}

}
