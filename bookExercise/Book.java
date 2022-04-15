package edu.monmouth.bookExercise;

public class Book {
	private int numberOfPages = 0;
	private BookTypes bookType;
	private String title = "";
	private double price = 0;
	/**
	 * @param numberOfPages
	 * @param bookType
	 * @param title
	 * @param price
	 * 88, 25.75, "To Kill a Mockingbird", BookTypes.HARDBACK
	 */
	
	public Book(int numberOfPages, BookTypes bookType, String title, double price) throws BookException {
		setNumberOfPages(numberOfPages);
		setBookType(bookType);
		setTitle(title);
		setPrice(price);
	}
	/*
	//book1 = new Book(88, 25.75, "To Kill a Mockingbird", BookTypes.HARDBACK);
	public Book(int numberOfPages, double price, String title, BookTypes bookType) throws BookException{
		setNumberOfPages(numberOfPages);
		setBookType(bookType);
		setTitle(title);
		setPrice(price);
	}
*/
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookType != other.bookType)
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	public int getNumberOfPages() {
		return numberOfPages;
	
	}



	public void setNumberOfPages(int numberOfPages) throws BookException {
		if(numberOfPages<1) {
			throw new BookException("Incorrect input for number of pages");
		}else {
		this.numberOfPages = numberOfPages;
		}
	}

	public BookTypes getBookType() {
		return bookType;
	}

	public void setBookType(BookTypes bookType) throws BookException  {

		this.bookType = bookType;
		
	}

	@Override
	public String toString() {
		return "Book numberOfPages=" + numberOfPages + ", bookType=" + bookType + ", title=" + title + ", price="
				+ price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws BookException  {
		if(title == null || title.length() == 0) {
			throw new BookException("Incorrect input");

		}else {
		this.title = title;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price)  throws BookException {
		if(price <0) {
			throw new BookException("Incorrect input for price");
		}else {
		this.price = price;
		}
	}


	


}
