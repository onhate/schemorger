schemorger (beta)
==========

SchemOrger is a Java Library for generating schema.org hidden html snippets for SEO and Rich Snippets.

It's really simple to use, like this:


```Java
Product product = new Product();
product.setName("simple product schemorger");

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
List<Offer> offers = product.buildOffers();

Offer offer = new Offer();
offer.setPrice(55.00);
offer.setAvailability(Link.toSchema(Constants.InStock));
offers.add(offer);

StringBuilder result = SchemaOrgBuilder.build(product);

```

and voilá, just place it on your page, [Check the RichSnippet Test Tool result](http://www.google.com/webmasters/tools/richsnippets?q=uploaded:8004f665707261df876b1f1ff8977129)


```HTML
<div itemscope itemtype="http://schema.org/Product">
<meta itemprop="releaseDate" content="2014-04-06T17:16"/>
<meta itemprop="name" content="simple product schemorger"/>
<div itemprop="offers" itemscope itemtype="http://schema.org/Offer">
<meta itemprop="price" content="55.0"/>
<link itemprop="availability" href="http://schema.org/InStock"/>
</div>
<div itemprop="brand" itemscope itemtype="http://schema.org/Brand">
<link itemprop="logo" href="http://placehold.it/300&text=schemorger"/>
<meta itemprop="name" content="Texelz"/>
<link itemprop="url" href="http://pt.wikipedia.org/wiki/Texelz"/>
</div>
<link itemprop="image" href="http://placehold.it/300&text=schemorger+product"/>
<meta itemprop="sku" content="42"/>
<link itemprop="url" href="http://www.texelz.com/schemorger"/>
</div>
```

All objects in package ```com.texelz.schemorger.model``` are based on [schema.org schemas](http://schema.org/docs/full.html)


P.S.:
=====

It's still in development

Thanks.
