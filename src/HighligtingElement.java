import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighligtingElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.freecrm.com");
		driver.findElement(By.name("username")).sendKeys("userName");
		driver.findElement(By.name("password")).sendKeys("password");
        WebElement element = driver.findElement(By.xpath("//input [contains(@type ,  'submit')]"));
		flash(driver, element);
		
	}
      public static void flash (WebDriver driver, WebElement element)
      {
    	  //JavascriptExecutor js = (JavascriptExecutor) driver; 
    	 String bgColour = element.getCssValue("backgroundColor");
    	 for (int i=0 ; i< 10; i++)
    	 {
    		 changeColor("rgb(0,200,0)" , driver , element);
    		 changeColor(bgColour , driver , element);
    	 }
      }
      public static void changeColor (String color , WebDriver driver , WebElement element)
      {
    	  JavascriptExecutor js = (JavascriptExecutor) driver;
    	  js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
    	  try 
    	  {
    		  Thread.sleep(20);
    	  }
    	  catch (InterruptedException e)
    	  {
    		  
    	  }
      }
	
}
