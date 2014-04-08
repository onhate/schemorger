package com.texelz.schemorger.model;

/**
<<<<<<< HEAD
 *
 * A book.
 * @fullPath Thing > CreativeWork > Book
 *
 * @author Texelz (by Onhate)
 *
 */
public class Book extends CreativeWork {

	private String bookEdition;
	private BookFormatType bookFormat;
	private Person illustrator;
	private String isbn;
	private Integer numberOfPages;
	/**
	 * The edition of the book.
	 */
	public String getBookEdition() {
		return this.bookEdition;
	}
	public void setBookEdition(String bookEdition) {
		this.bookEdition = bookEdition;
	}
	/**
	 * The format of the book.
	 */
	public BookFormatType getBookFormat() {
		return this.bookFormat;
	}
	public void setBookFormat(BookFormatType bookFormat) {
		this.bookFormat = bookFormat;
	}
	/**
	 * The illustrator of the book.
	 */
	public Person getIllustrator() {
		return this.illustrator;
	}
	public void setIllustrator(Person illustrator) {
		this.illustrator = illustrator;
	}
=======
 * 
 * A book.
 * 
 * @fullPath Thing > CreativeWork > Book
 * 
 * @author Texelz (by Onhate)
 * 
 */
public class Book extends CreativeWork {

	private String bookEdition;
	private BookFormatType bookFormat;
	private Person illustrator;
	private String isbn;
	private Integer numberOfPages;

	/**
	 * The edition of the book.
	 */
	public String getBookEdition() {
		return this.bookEdition;
	}

	public void setBookEdition(String bookEdition) {
		this.bookEdition = bookEdition;
	}

	/**
	 * The format of the book.
	 */
	public BookFormatType getBookFormat() {
		return this.bookFormat;
	}

	public void setBookFormat(BookFormatType bookFormat) {
		this.bookFormat = bookFormat;
	}

	/**
	 * The illustrator of the book.
	 */
	public Person getIllustrator() {
		return this.illustrator;
	}

	public void setIllustrator(Person illustrator) {
		this.illustrator = illustrator;
	}

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The ISBN of the book.
	 */
	public String getIsbn() {
		return this.isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
<<<<<<< HEAD
=======

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	/**
	 * The number of pages in the book.
	 */
	public Integer getNumberOfPages() {
		return this.numberOfPages;
	}
<<<<<<< HEAD
=======

>>>>>>> 0afd273b7e06466621f002330098e9f9cdedab3e
	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
}
