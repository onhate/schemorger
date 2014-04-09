package org.schema;

/**
 * 
 * A list of items of any sort—for example, Top 10 Movies About Weathermen, or
 * Top 100 Party Songs. Not to be confused with HTML lists, which are often used
 * only for formatting.
 * 
 * @fullPath Thing > CreativeWork > ItemList
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class ItemList extends CreativeWork {

	private String itemListElement;
	private String itemListOrder;

	/**
	 * A single list item.
	 */
	public String getItemListElement() {
		return this.itemListElement;
	}

	/**
	 * A single list item.
	 */
	public void setItemListElement(String itemListElement) {
		this.itemListElement = itemListElement;
	}

	/**
	 * Type of ordering (e.g. Ascending, Descending, Unordered).
	 */
	public String getItemListOrder() {
		return this.itemListOrder;
	}

	/**
	 * Type of ordering (e.g. Ascending, Descending, Unordered).
	 */
	public void setItemListOrder(String itemListOrder) {
		this.itemListOrder = itemListOrder;
	}
}
