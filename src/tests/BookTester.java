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
import model.BookLogic;

/**
 * @author delan
 *
 */
public class BookTester {
	
	Book harryPotter = new Book("Harry Potter", "J.K.Rowling","Fiction");
	BookLogic logic = new BookLogic();
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsFiction() {
		harryPotter.setGenre("Fiction");
		Boolean genreBook = logic.isFiction(harryPotter);
		assertEquals(true, genreBook);

	}
	
	@Test
	public void testIsFemaleAuthor() {
		harryPotter.setAuthor("J.K.Rowling");
		Boolean authorBook = logic.isFiction(harryPotter);
		assertEquals(true, authorBook);

	}
	

}
