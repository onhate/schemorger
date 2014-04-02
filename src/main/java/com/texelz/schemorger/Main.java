package com.texelz.schemorger;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

import com.texelz.schemorger.definition.Link;
import com.texelz.schemorger.model.AggregateRating;
import com.texelz.schemorger.model.Brand;
import com.texelz.schemorger.model.Offer;
import com.texelz.schemorger.model.Product;

public class Main {

	public static void main(String[] args) throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException {
		Product product = new Product();
		product.setName("produto 123");

		// sku
		product.setSku("123");

		// releaseDate
		product.setReleaseDate(new Date());

		// brand
		Brand brand = new Brand();
		brand.setName("Brastemp");
		brand.setUrl(Link.toWiki("Brastemp"));
		brand.setLogo(Link
				.to("http://upload.wikimedia.org/wikipedia/commons/thumb/b/be/Brastemp_logo.png/200px-Brastemp_logo.png"));
		product.setBrand(brand);

		// url
		product.setUrl(Link.to("http://www.taqi.com.br/p/teste-12312"));

		// image
		product.setImage(Link.to("http://greenasathistle.files.wordpress.com/2007/03/microwave.jpg"));

		// Offer
		List<Offer> offers = product.buildOffers();
		// AggregateOffer agOffer = new AggregateOffer();
		// agOffer.setLowPrice(55.0);
		// agOffer.setHighPrice(100.0);
		// agOffer.setOfferCount(2);
		// offers.add(agOffer);

		Offer offer = new Offer();
		offer.setPrice(55.00);
		offer.setAvailability(Link.toSchema(Constants.InStock));
		offers.add(offer);

		// AggregateRating
		AggregateRating aggregateRating = product.buildAggregateRating();
		aggregateRating.setRatingValue(3.5);
		aggregateRating.setReviewCount(11);

		System.err.println(SchemaOrgBuilder.build(product));
	}
}
