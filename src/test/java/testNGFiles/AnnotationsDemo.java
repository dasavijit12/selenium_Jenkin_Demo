package testNGFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	
	// This will run only once before any method inside @Test annotation.
		@BeforeTest
		public void annotationBeforeTest() {
			System.out.println("This will run only once before any method inside @test annotation.");
		}

		// This will run before every method inside @Test annotation.
		@AfterMethod
		public void annotationBeforeMethod() {
			System.out.println("This will run before every method inside @Test annotation.");
		}

		@Test
		public void openBrowserTest() {
			System.out.println("Open Browser");
		}

		@Test
		public void openApplicationTest() {
			System.out.println("Open Application");
		}

		// This will run after every method inside @Test annotation.
		@BeforeMethod
		public void annotationAfterMethod() {
			System.out.println("This will run after every method inside @Test annotation.");
		}

		// This will run only once after all methods inside @Test annotation.
		@AfterTest
		public void annotationafterTest() {
			System.out.println("This will run only once after all methods inside @Test annotation.");
		}

}
