package State;

public class PlayingState implements MP3State {

	public void playMusic(MP3PlayerContext context) {
		// do nothing	
	}

	public void stopMusic(MP3PlayerContext context) {
		System.out.println("Stopped playing the music");
		context.setState(new StoppedState());
	}

	public void nextSong(MP3PlayerContext context) {
		System.out.println("Playing the next sound");
	}

	public void prevSong(MP3PlayerContext context) {
		System.out.println("Playing the next sound");
	}
}
