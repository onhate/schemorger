package org.schema;

/**
 * 
 * A collection of music tracks in playlist form.
 * 
 * @fullPath Thing > CreativeWork > MusicPlaylist
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MusicPlaylist extends CreativeWork {

	private Integer numTracks;
	private MusicRecording track;

	/**
	 * The number of tracks in this album or playlist.
	 */
	public Integer getNumTracks() {
		return this.numTracks;
	}

	/**
	 * The number of tracks in this album or playlist.
	 */
	public void setNumTracks(Integer numTracks) {
		this.numTracks = numTracks;
	}

	/**
	 * A music recording (track)—usually a single song. Supercedes <a
	 * href="tracks">tracks</a>.
	 */
	public MusicRecording getTrack() {
		return this.track;
	}

	/**
	 * A music recording (track)—usually a single song. Supercedes <a
	 * href="tracks">tracks</a>.
	 */
	public void setTrack(MusicRecording track) {
		this.track = track;
	}
}
