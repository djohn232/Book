/**
 * @author Delanie Johnson - dmjohnson33
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */
package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author delan
 *
 */
public class BookTestRunner {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(BookTester.class);
		
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}
}
