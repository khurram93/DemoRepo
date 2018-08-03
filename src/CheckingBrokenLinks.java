import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingBrokenLinks {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	      
	      driver.get("https://www.juegostudio.com");
	      
//	      driver.findElement(By.name("username")).sendKeys("sheikh");
//	      driver.findElement(By.name("password")).sendKeys("sheikh");
//	      driver.findElement(By.xpath("//input[@value = 'Login']")).submit();
//	      
//	      driver.switchTo().frame("mainpanel");
//	      
	      //Collecting all the links and images 
	      List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	      allLinks.addAll(driver.findElements(By.tagName("img")));
           
	      //Number of links 
	      System.out.println(allLinks.size());
	      
	      //Filtering the Links
	      List<WebElement> actual_Links = new ArrayList<WebElement>();
	      
	      for (WebElement webElement : allLinks)
	      {
	    	  //If javaScriptLinks are present then we can add && webElement.getAttribute("href").contains("javaScript")
			if (webElement.getAttribute("href") !=null)
			{ 
				actual_Links.add(webElement);
			}
		}
	      System.out.println(actual_Links.size());
	      
	      
	      for (WebElement webElement : actual_Links) 
	      {
			 try {
				HttpURLConnection connection = (HttpURLConnection)new URL(webElement.getAttribute("href")).openConnection();
				connection.connect();
				String response = connection.getResponseMessage();
				connection.disconnect();
				System.out.println(webElement.getAttribute("href") + "-----" +response);
			} catch (IOException e) 
			 {
			   e.getMessage();
			}
		}
	}

}
