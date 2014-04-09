package org.schema;

/**
 * 
 * A collection of datasets.
 * 
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

	/**
	 * A dataset contained in a catalog.
	 */
	public void setDataset(Dataset dataset) {
		this.dataset = dataset;
	}
}
