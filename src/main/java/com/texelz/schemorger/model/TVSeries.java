package com.texelz.schemorger.model;

/**
 *
 * Series dedicated to TV broadcast and associated online delivery.
 * @fullPath Thing > CreativeWork > TVSeries
 *
 * @author Texelz (by Onhate)
 *
 */
public class TVSeries extends CreativeWork {

	private Person actor;
	private Person director;
	private java.util.Date endDate;
	private Episode episode;
	private Object musicBy;
	private Double numberOfEpisodes;
	private Person producer;
	private Organization productionCompany;
	private Season season;
	private java.util.Date startDate;
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
	 * The end date and time of the event or item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 */
	public java.util.Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * An episode of a TV/radio series or season Supercedes <a href="episodes">episodes</a>.
	 */
	public Episode getEpisode() {
		return this.episode;
	}
	public void setEpisode(Episode episode) {
		this.episode = episode;
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
	 * The number of episodes in this season or series.
	 */
	public Double getNumberOfEpisodes() {
		return this.numberOfEpisodes;
	}
	public void setNumberOfEpisodes(Double numberOfEpisodes) {
		this.numberOfEpisodes = numberOfEpisodes;
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
	 * A season in a tv/radio series. Supercedes <a href="seasons">seasons</a>.
	 */
	public Season getSeason() {
		return this.season;
	}
	public void setSeason(Season season) {
		this.season = season;
	}
	/**
	 * The start date and time of the event or item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 */
	public java.util.Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
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
