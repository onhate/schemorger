package com.texelz.schemorger;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import com.texelz.schemorger.definition.Link;
import com.texelz.schemorger.model.AggregateRating;
import com.texelz.schemorger.model.Brand;
import com.texelz.schemorger.model.ItemAvailability;
import com.texelz.schemorger.model.Offer;
import com.texelz.schemorger.model.Product;

public class Main {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException {
		Product product = new Product();
		product.setName("simple product schemorger");

		// rating
		AggregateRating aggregateRating = new AggregateRating();
		aggregateRating.setRatingValue("4.5");
<<<<<<< HEAD
		aggregateRating.setReviewCount(42.0);
=======
		aggregateRating.setReviewCount(42D);
>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
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
		availability.setSameAs(Link.toSchema(Constants.InStock));
		offer.setAvailability(availability);
		product.setOffers(offer);

		StringBuilder result = SchemaOrgBuilder.build(product);
		System.err.println(result);
	}
}
