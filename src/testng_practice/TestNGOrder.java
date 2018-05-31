package testng_practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGOrder {
	
	@BeforeSuite
		public void beforeSuite()
		{
			System.out.println("Before Suite");
		}

	@AfterSuite	
		public void afterSuite()
		{
			System.out.println("After suite");
		}
	@BeforeClass
		public void beforeClass()
		{
			System.out.println("Before Class");
		}
	@AfterClass	
		public void afterClass()
		{
			System.out.println("After class");
		}
	@BeforeTest	
		public void beforeTest()
		{
			System.out.println("Before Test");
		}
	@AfterTest
		public void afterTest()
		{
			System.out.println("After Test");
		}
	@Test
		public void test()
		{
			System.out.println("Test");
		}
		
		
		
}
