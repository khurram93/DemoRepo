package Com.TestNG_Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * TestNG notes 
 * 1.It's open source tool
 * 2.The main aim of testNG design testCase in systematic way
 * 3.HTML report 
 * 4.Diff priorities
 * 5.Priorities and sequence
 * 6.Dependency 
 * 7.Data provider
 * 8.it's TDD frameWork 
 * 
 */

//Pre-condition annotation -------Starting with before
public class TestNG_Practice 
{
	@BeforeSuite
	public void setUp ()
	{
		
	}
	
	@BeforeTest 
	public void launchBrowser()
	{
		
	}
	
	@BeforeClass 
	public void login () 
	{
		
	}
	
     @BeforeMethod
     public static void EnterURL ()
     {
    	 
     }
     
     //Test case ------Starting with test @Test
     
     @Test 
     public void googleTitleTest ()
     {
    	 
     }
     @Test 
     public void searchTest ()
     {
    	 
     }
     
     //post conditions starting with @After
     @AfterMethod 
     public void aa ()
     {
    	 
     }
     @AfterClass
     public void b ()
     {
    	 
     }
     @AfterTest
     public void a()
     {
    	 
     }
}
