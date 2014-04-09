package org.schema;

/**
 * 
 * A music recording (track), usually a single song.
 * 
 * @fullPath Thing > CreativeWork > MusicRecording
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MusicRecording extends CreativeWork {

	private MusicGroup byArtist;
	private Duration duration;
	private MusicAlbum inAlbum;
	private MusicPlaylist inPlaylist;

	/**
	 * The artist that performed this album or recording.
	 */
	public MusicGroup getByArtist() {
		return this.byArtist;
	}

	/**
	 * The artist that performed this album or recording.
	 */
	public void setByArtist(MusicGroup byArtist) {
		this.byArtist = byArtist;
	}

	/**
	 * The duration of the item (movie, audio recording, event, etc.) in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
	 */
	public Duration getDuration() {
		return this.duration;
	}

	/**
	 * The duration of the item (movie, audio recording, event, etc.) in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
	 */
	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	/**
	 * The album to which this recording belongs.
	 */
	public MusicAlbum getInAlbum() {
		return this.inAlbum;
	}

	/**
	 * The album to which this recording belongs.
	 */
	public void setInAlbum(MusicAlbum inAlbum) {
		this.inAlbum = inAlbum;
	}

	/**
	 * The playlist to which this recording belongs.
	 */
	public MusicPlaylist getInPlaylist() {
		return this.inPlaylist;
	}

	/**
	 * The playlist to which this recording belongs.
	 */
	public void setInPlaylist(MusicPlaylist inPlaylist) {
		this.inPlaylist = inPlaylist;
	}
}
