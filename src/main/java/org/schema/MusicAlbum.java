package org.schema;

/**
 * 
 * A collection of music tracks.
 * 
 * @fullPath Thing > CreativeWork > MusicPlaylist > MusicAlbum
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class MusicAlbum extends MusicPlaylist {

	private MusicGroup byArtist;

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
}
