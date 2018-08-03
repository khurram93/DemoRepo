package Com.TestNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsMethod 
{
	WebDriver driver;
     @Test 
     public void setUp ()
     {
    	 System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");

 		driver = new ChromeDriver();
 		driver.get("http://www.google.com");
     }
     
     @Test (dependsOnMethods = "setUp")
     public void homePage()
     {
    	 String actual = driver.getTitle();
 		System.out.println(actual);
 		Assert.assertEquals(actual, "Google");
     }
}
