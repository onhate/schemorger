package com.texelz.schemorger.model;

/**
 *
 * A radio episode which can be part of a series or season.
 * @fullPath Thing > CreativeWork > Episode > RadioEpisode
 *
 * @author Texelz (by Onhate)
 *
 */
public class RadioEpisode extends Episode {

	private Person actor;
	private Person director;
	private Object musicBy;
	private Season partOfSeason;
	private Series partOfSeries;
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
	 * The season to which this episode belongs.
	 */
	public Season getPartOfSeason() {
		return this.partOfSeason;
	}
	public void setPartOfSeason(Season partOfSeason) {
		this.partOfSeason = partOfSeason;
	}
	/**
	 * The series to which this episode or season belongs. Supercedes <a href="partOfTVSeries">partOfTVSeries</a>.
	 */
	public Series getPartOfSeries() {
		return this.partOfSeries;
	}
	public void setPartOfSeries(Series partOfSeries) {
		this.partOfSeries = partOfSeries;
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
