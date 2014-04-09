package org.schema;

/**
 * 
 * A short radio progam or a segment/part of a radio program.
 * 
 * @fullPath Thing > CreativeWork > Clip > RadioClip
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class RadioClip extends Clip {

	private Season partOfSeason;
	private Series partOfSeries;

	/**
	 * The season to which this episode belongs.
	 */
	public Season getPartOfSeason() {
		return this.partOfSeason;
	}

	/**
	 * The season to which this episode belongs.
	 */
	public void setPartOfSeason(Season partOfSeason) {
		this.partOfSeason = partOfSeason;
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
}
