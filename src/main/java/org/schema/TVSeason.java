package org.schema;

/**
 * 
 * Season dedicated to TV broadcast and associated online delivery.
 * 
 * @fullPath Thing > CreativeWork > Season > TVSeason
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class TVSeason extends Season {

	private java.util.Date endDate;
	private Episode episode;
	private Double numberOfEpisodes;
	private Series partOfSeries;
	private Integer seasonNumber;
	private java.util.Date startDate;
	private VideoObject trailer;

	/**
	 * The end date and time of the event or item (in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 */
	public java.util.Date getEndDate() {
		return this.endDate;
	}

	/**
	 * The end date and time of the event or item (in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 */
	public void setEndDate(java.util.Date endDate) {
		this.endDate = endDate;
	}

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
	 * Position of the season within an ordered group of seasons.
	 */
	public Integer getSeasonNumber() {
		return this.seasonNumber;
	}

	/**
	 * Position of the season within an ordered group of seasons.
	 */
	public void setSeasonNumber(Integer seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

	/**
	 * The start date and time of the event or item (in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 */
	public java.util.Date getStartDate() {
		return this.startDate;
	}

	/**
	 * The start date and time of the event or item (in <a
	 * href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>).
	 */
	public void setStartDate(java.util.Date startDate) {
		this.startDate = startDate;
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
