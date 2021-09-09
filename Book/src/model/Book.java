/**
 * @author Delanie Johnson - dmjohnson33 
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */
package model;

/**
 * @author delan
 *
 */
public class Book {

	String title;
	String author;
	String genre;
	static String bookInfo;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the genre 
	 */
	public String getGenre() {
		return genre;
	}
	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public Book() {
		System.out.println("Default Constructor");
	}
	
	public Book(String title, String author, String genre) {
		String bookTitle = title;
		String bookAuthor = author;
		String bookGenre = genre;
		
		System.out.println("Title: " + bookTitle + "\nAuthor: " + bookAuthor + "\nGenre: " + bookGenre);
	}

	public String bookInfo() {
		return "Book Information: " + bookInfo;
	}
}
