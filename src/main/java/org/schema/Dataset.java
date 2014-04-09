package org.schema;

/**
 * 
 * A body of structured information describing some topic(s) of interest.
 * 
 * @fullPath Thing > CreativeWork > Dataset
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Dataset extends CreativeWork {

	private DataCatalog catalog;
	private DataDownload distribution;
	private Place spatial;
	private java.util.Date temporal;

	/**
	 * A data catalog which contains a dataset.
	 */
	public DataCatalog getCatalog() {
		return this.catalog;
	}

	/**
	 * A data catalog which contains a dataset.
	 */
	public void setCatalog(DataCatalog catalog) {
		this.catalog = catalog;
	}

	/**
	 * A downloadable form of this dataset, at a specific location, in a
	 * specific format.
	 */
	public DataDownload getDistribution() {
		return this.distribution;
	}

	/**
	 * A downloadable form of this dataset, at a specific location, in a
	 * specific format.
	 */
	public void setDistribution(DataDownload distribution) {
		this.distribution = distribution;
	}

	/**
	 * The range of spatial applicability of a dataset, e.g. for a dataset of
	 * New York weather, the state of New York.
	 */
	public Place getSpatial() {
		return this.spatial;
	}

	/**
	 * The range of spatial applicability of a dataset, e.g. for a dataset of
	 * New York weather, the state of New York.
	 */
	public void setSpatial(Place spatial) {
		this.spatial = spatial;
	}

	/**
	 * The range of temporal applicability of a dataset, e.g. for a 2011 census
	 * dataset, the year 2011 (in ISO 8601 time interval format).
	 */
	public java.util.Date getTemporal() {
		return this.temporal;
	}

	/**
	 * The range of temporal applicability of a dataset, e.g. for a 2011 census
	 * dataset, the year 2011 (in ISO 8601 time interval format).
	 */
	public void setTemporal(java.util.Date temporal) {
		this.temporal = temporal;
	}
}
