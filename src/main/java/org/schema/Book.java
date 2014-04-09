package org.schema;

/**
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

	/**
	 * The edition of the book.
	 */
	public void setBookEdition(String bookEdition) {
		this.bookEdition = bookEdition;
	}

	/**
	 * The format of the book.
	 */
	public BookFormatType getBookFormat() {
		return this.bookFormat;
	}

	/**
	 * The format of the book.
	 */
	public void setBookFormat(BookFormatType bookFormat) {
		this.bookFormat = bookFormat;
	}

	/**
	 * The illustrator of the book.
	 */
	public Person getIllustrator() {
		return this.illustrator;
	}

	/**
	 * The illustrator of the book.
	 */
	public void setIllustrator(Person illustrator) {
		this.illustrator = illustrator;
	}

	/**
	 * The ISBN of the book.
	 */
	public String getIsbn() {
		return this.isbn;
	}

	/**
	 * The ISBN of the book.
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * The number of pages in the book.
	 */
	public Integer getNumberOfPages() {
		return this.numberOfPages;
	}

	/**
	 * The number of pages in the book.
	 */
	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
}
