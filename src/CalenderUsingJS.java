import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUsingJS {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      
	      driver.get("http://www.spicejet.com");
	      Thread.sleep(5000);
	      WebElement element =  driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
	      select_Calender_Date(element, driver ,"30-07-2018");   

	}
   public static void select_Calender_Date (WebElement element , WebDriver driver ,String dateVal)
   {
	   JavascriptExecutor js = ((JavascriptExecutor) driver);
	   js.executeScript("arguments[0].setAttribute('value' , '"+dateVal+"');", element);
	   
   }
}
