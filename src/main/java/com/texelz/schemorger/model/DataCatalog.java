package com.texelz.schemorger.model;

/**
 *
 * A collection of datasets.
 * @fullPath Thing > CreativeWork > DataCatalog
 *
 * @author Texelz (by Onhate)
 *
 */
public class DataCatalog extends CreativeWork {

	private Dataset dataset;
	/**
	 * A dataset contained in a catalog.
	 */
	public Dataset getDataset() {
		return this.dataset;
	}
	public void setDataset(Dataset dataset) {
		this.dataset = dataset;
	}
}
