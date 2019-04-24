package State;

public class Client {
	
	public static void main(String[] args) {
		MP3PlayerContext mp3Player = new MP3PlayerContext();
		mp3Player.playMusic();
		mp3Player.nextSong();
		mp3Player.stopMusic();
		mp3Player.playMusic();
	}

}
