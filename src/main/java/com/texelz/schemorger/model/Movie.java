package com.texelz.schemorger.model;

/**
 *
 * A movie.
 * @fullPath Thing > CreativeWork > Movie
 *
 * @author Texelz (by Onhate)
 *
 */
public class Movie extends CreativeWork {

	private Person actor;
	private Person director;
	private Duration duration;
	private Object musicBy;
	private Person producer;
	private Organization productionCompany;
	private VideoObject trailer;
	/**
	 * A cast member of the movie, tv/radio series, season, episode, or video. Supercedes <a href="actors">actors</a>.
	 */
	public Person getActor() {
		return this.actor;
	}
	public void setActor(Person actor) {
		this.actor = actor;
	}
	/**
	 * The director of the movie, tv/radio episode or series. Supercedes <a href="directors">directors</a>.
	 */
	public Person getDirector() {
		return this.director;
	}
	public void setDirector(Person director) {
		this.director = director;
	}
	/**
	 * The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>.
	 */
	public Duration getDuration() {
		return this.duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	/**
	 * The composer of the movie or TV/radio soundtrack.
	 * @see Person
	 * @see MusicGroup
	 */
	public Object getMusicBy() {
		return this.musicBy;
	}
	public void setMusicBy(Object musicBy) {
		this.musicBy = musicBy;
	}
	/**
	 * The producer of the movie, tv/radio series, season, or episode, or video.
	 */
	public Person getProducer() {
		return this.producer;
	}
	public void setProducer(Person producer) {
		this.producer = producer;
	}
	/**
	 * The production company or studio that made the movie, tv/radio series, season, or episode, or media object.
	 */
	public Organization getProductionCompany() {
		return this.productionCompany;
	}
	public void setProductionCompany(Organization productionCompany) {
		this.productionCompany = productionCompany;
	}
	/**
	 * The trailer of a movie or tv/radio series, season, or episode.
	 */
	public VideoObject getTrailer() {
		return this.trailer;
	}
	public void setTrailer(VideoObject trailer) {
		this.trailer = trailer;
	}
}
