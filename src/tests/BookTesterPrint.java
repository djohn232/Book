/**
 * @author Delanie Johnson - dmjohnson33
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */
package tests;

import static org.junit.Assert.*; 
import org.junit.Before;
import org.junit.Test;
import model.Book;
/**
 * @author delan
 *
 */
public class BookTesterPrint {
	
	String titleTest = "Lord of the Rings";
	String authorTest = "J.R.R. Tolkien";
	String genreTest = "Fiction";
	Book newBook = new Book(titleTest, authorTest, genreTest);
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String bookInfo = "Lord of the Rings, J.R.R Tolkien, Fiction";
		assertEquals(bookInfo, newBook.bookInfo());
	}

}
