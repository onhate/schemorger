package org.schema;

/**
 * 
 * A particular physical business or branch of an organization. Examples of
 * LocalBusiness include a restaurant, a particular branch of a restaurant
 * chain, a branch of a bank, a medical practice, a club, a bowling alley, etc.
 * 
 * @fullPath Thing > Place > LocalBusiness
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class LocalBusiness extends Place {

	private Organization branchOf;
	private String currenciesAccepted;
	private Duration openingHours;
	private String paymentAccepted;
	private String priceRange;

	/**
	 * The larger organization that this local business is a branch of, if any.
	 */
	public Organization getBranchOf() {
		return this.branchOf;
	}

	/**
	 * The larger organization that this local business is a branch of, if any.
	 */
	public void setBranchOf(Organization branchOf) {
		this.branchOf = branchOf;
	}

	/**
	 * The currency accepted (in <a
	 * href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217 currency
	 * format</a>).
	 */
	public String getCurrenciesAccepted() {
		return this.currenciesAccepted;
	}

	/**
	 * The currency accepted (in <a
	 * href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217 currency
	 * format</a>).
	 */
	public void setCurrenciesAccepted(String currenciesAccepted) {
		this.currenciesAccepted = currenciesAccepted;
	}

	/**
	 * The opening hours for a business. Opening hours can be specified as a
	 * weekly time range, starting with days, then times per day. Multiple days
	 * can be listed with commas ',' separating each day. Day or time ranges are
	 * specified using a hyphen '-'.<br />
	 * - Days are specified using the following two-letter combinations:
	 * <code>Mo</code>, <code>Tu</code>, <code>We</code>, <code>Th</code>,
	 * <code>Fr</code>, <code>Sa</code>, <code>Su</code>.<br />
	 * - Times are specified using 24:00 time. For example, 3pm is specified as
	 * <code>15:00</code>. <br />
	 * - Here is an example:
	 * <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Tu,Th 16:00-20:00&quot;&gt;Tuesdays and Thursdays 4-8pm&lt;/time&gt;</code>
	 * . <br />
	 * - If a business is open 7 days a week, then it can be specified as
	 * <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Mo-Su&quot;&gt;Monday through Sunday, all day&lt;/time&gt;</code>
	 * .
	 */
	public Duration getOpeningHours() {
		return this.openingHours;
	}

	/**
	 * The opening hours for a business. Opening hours can be specified as a
	 * weekly time range, starting with days, then times per day. Multiple days
	 * can be listed with commas ',' separating each day. Day or time ranges are
	 * specified using a hyphen '-'.<br />
	 * - Days are specified using the following two-letter combinations:
	 * <code>Mo</code>, <code>Tu</code>, <code>We</code>, <code>Th</code>,
	 * <code>Fr</code>, <code>Sa</code>, <code>Su</code>.<br />
	 * - Times are specified using 24:00 time. For example, 3pm is specified as
	 * <code>15:00</code>. <br />
	 * - Here is an example:
	 * <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Tu,Th 16:00-20:00&quot;&gt;Tuesdays and Thursdays 4-8pm&lt;/time&gt;</code>
	 * . <br />
	 * - If a business is open 7 days a week, then it can be specified as
	 * <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Mo-Su&quot;&gt;Monday through Sunday, all day&lt;/time&gt;</code>
	 * .
	 */
	public void setOpeningHours(Duration openingHours) {
		this.openingHours = openingHours;
	}

	/**
	 * Cash, credit card, etc.
	 */
	public String getPaymentAccepted() {
		return this.paymentAccepted;
	}

	/**
	 * Cash, credit card, etc.
	 */
	public void setPaymentAccepted(String paymentAccepted) {
		this.paymentAccepted = paymentAccepted;
	}

	/**
	 * The price range of the business, for example <code>$$$</code>.
	 */
	public String getPriceRange() {
		return this.priceRange;
	}

	/**
	 * The price range of the business, for example <code>$$$</code>.
	 */
	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}
}
