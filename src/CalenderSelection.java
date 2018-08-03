import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderSelection {

	public static void main(String[] args)
	{
	  System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  String s = "25-September-2004";
	  String[] split = s.split("-");
	  
	  String day = split[0];
	  String month = split[1];
	  String year  =  split[2];
	  
	  Select select1 , select2;
	  
	  driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      
      driver.get("http://www.freecrm.com");
      
      driver.findElement(By.name("username")).sendKeys("sheikh");
      driver.findElement(By.name("password")).sendKeys("sheikh");
      driver.findElement(By.xpath("//input[@value = 'Login']")).submit();
      
      driver.switchTo().frame("mainpanel");
      
      select1 = new Select(driver.findElement(By.xpath("//select[@name = 'slctMonth']")));
      
      select1.selectByVisibleText(month);
      
      select2 = new Select (driver.findElement(By.name("slctYear")));
      
      select2.selectByValue(year);
      
      driver.findElement(By.xpath("//div[@id ='crmcalendar']//tr[2]//following-sibling::tr//td[contains (text() , '"+day+"')]")).click();
	}

}
