package coding.challenge.jukebox;

public interface Selector {

	void nextSongBtn();

	void prevSongBtn();

	void addSongToPlaylistBtn( Song song );

	void removeSongFromPlaylistBtn( Song song );

	void shuffleBtn();
}
