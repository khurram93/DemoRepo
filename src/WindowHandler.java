import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*
		 * Three type of pop-up
		 * 1.Alert pop-up also know as javaScript pop-up -- Methods (Accept , dismiss , sendkeys , getText)
		 * 2.File upload pop-up ----Sendkeys method only work if type ='File' is present in XML code
		 * 3.Different windows  --- we use windowHandler API getwindowHandles method to fetch all the windows 
		 * 
		 */
		
		
		//Explicit wait 
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//To store different windows 
		ArrayList<String> windows = new ArrayList<String>();
	
		driver.get("https://www.naukri.com/");

		Set handler = driver.getWindowHandles();
		
		Iterator<String> itr = handler.iterator();
		while (itr.hasNext())
		{
			windows.add(itr.next());
		}
		//Moving to first window
		driver.switchTo().window(windows.get(1));
		System.out.println("Title " + driver.getTitle());
		driver.close();
	
		//Moving next window
		driver.switchTo().window(windows.get(2));
		System.out.println("Title " + driver.getTitle());
		driver.close();
		
		//Moving back to main window
		driver.switchTo().window(windows.get(0));
		System.out.println("Title " + driver.getTitle());
		
		//Handling the alert 
		waitForAlert(driver);
		
	}
	//Creating wait method for alert pop-up
	static void waitForAlert(WebDriver driver) throws InterruptedException
      {
    	  int i =1 ;
    	  while (i++ < 30)
    	  {
    		  try 
    		  {
    			  Alert alert = driver.switchTo().alert();
    			   System.out.println( alert.getText());
    			  break;
    		  }
    		  catch (NoAlertPresentException e)
    		  {
    			  Thread.sleep(1000);
    			  continue;
    		  }
    	  }
      }
}
