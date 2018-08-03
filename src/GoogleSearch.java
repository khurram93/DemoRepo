import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class GoogleSearch {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		////
		driver.get("http://www.google.com");
		
		String searchWord = "testing interview questions";
		
		driver.findElement(By.id("lst-ib")).sendKeys("testing");
		
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class = 'sbsb_b']//li"));
		Iterator<WebElement> itr = elements.iterator();
		while (itr.hasNext())
		{
			String currentElement =itr.next().getText(); 
			System.out.println(currentElement);
		      
			if (searchWord.equals(currentElement))
			{
				itr.next().click();
				driver.findElement(By.name("btnK")).submit();
				break;
			}
		}
		System.out.println("Done");
	}
	
	public static void searchClick (WebDriver driver , String searchWord)
	{
		
	}

}
