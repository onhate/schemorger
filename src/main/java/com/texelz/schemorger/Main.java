package com.texelz.schemorger;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.schema.AggregateRating;
import org.schema.Brand;
import org.schema.ItemAvailability;
import org.schema.Offer;
import org.schema.Product;
import org.schema.base.Link;

public class Main {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException {
		Product product = new Product();
		product.setName("simple product schemorger");

		// rating
		AggregateRating aggregateRating = new AggregateRating();
		aggregateRating.setBestRating(5);
		aggregateRating.setWorstRating(1);
		aggregateRating.setRatingValue("4.5");
		aggregateRating.setReviewCount(42.0);
		product.setAggregateRating(aggregateRating);

		// sku
		product.setSku("42");

		// releaseDate
		product.setReleaseDate(new Date());

		// brand
		Brand brand = new Brand();
		brand.setName("Texelz");
		brand.setUrl(Link.toWiki("Texelz"));
		brand.setLogo(Link.to("http://placehold.it/300&text=schemorger"));
		product.setBrand(brand);

		// url
		product.setUrl(Link.to("http://www.texelz.com/schemorger"));

		// image
		product.setImage(Link.to("http://placehold.it/300&text=schemorger+product"));

		// Offer
		Offer offer = new Offer();
		offer.setPrice(55.00);
		ItemAvailability availability = new ItemAvailability();
		availability.setUrl(Link.toSchema(Constants.InStock));
		offer.setAvailability(availability);
		product.setOffers(offer);

		StringBuilder result = SchemaOrgBuilder.build(product);
		System.err.println(result);
	}
}
