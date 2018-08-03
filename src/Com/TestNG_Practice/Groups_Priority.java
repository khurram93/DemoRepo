package Com.TestNG_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Groups_Priority {
	WebDriver driver ;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	  driver.get("http://www.google.com");
	}
	
	@Test (priority =1, groups = "GoogleHomePage")
	public void title_Test ()
	{
		String actual = driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, "Google");
	}
	
	@Test (priority =2 , groups = "GoogleHomePage")
	public void  logo_Test ()
	{
		boolean b = driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(b);
	}
	
	@AfterMethod
	public void tearDown ()
	{
		driver.quit();
	}
}
