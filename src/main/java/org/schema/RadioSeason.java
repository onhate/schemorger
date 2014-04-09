package org.schema;

/**
 * 
 * Season dedicated to radio broadcast and associated online delivery.
 * 
 * @fullPath Thing > CreativeWork > Season > RadioSeason
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class RadioSeason extends Season {

	private Episode episode;
	private Double numberOfEpisodes;
	private Series partOfSeries;
	private VideoObject trailer;

	/**
	 * An episode of a TV/radio series or season Supercedes <a
	 * href="episodes">episodes</a>.
	 */
	public Episode getEpisode() {
		return this.episode;
	}

	/**
	 * An episode of a TV/radio series or season Supercedes <a
	 * href="episodes">episodes</a>.
	 */
	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	/**
	 * The number of episodes in this season or series.
	 */
	public Double getNumberOfEpisodes() {
		return this.numberOfEpisodes;
	}

	/**
	 * The number of episodes in this season or series.
	 */
	public void setNumberOfEpisodes(Double numberOfEpisodes) {
		this.numberOfEpisodes = numberOfEpisodes;
	}

	/**
	 * The series to which this episode or season belongs. Supercedes <a
	 * href="partOfTVSeries">partOfTVSeries</a>.
	 */
	public Series getPartOfSeries() {
		return this.partOfSeries;
	}

	/**
	 * The series to which this episode or season belongs. Supercedes <a
	 * href="partOfTVSeries">partOfTVSeries</a>.
	 */
	public void setPartOfSeries(Series partOfSeries) {
		this.partOfSeries = partOfSeries;
	}

	/**
	 * The trailer of a movie or tv/radio series, season, or episode.
	 */
	public VideoObject getTrailer() {
		return this.trailer;
	}

	/**
	 * The trailer of a movie or tv/radio series, season, or episode.
	 */
	public void setTrailer(VideoObject trailer) {
		this.trailer = trailer;
	}
}
