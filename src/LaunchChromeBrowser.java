import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");
	  
		//Launch the chrome
		WebDriver driver = new ChromeDriver();	

		 //Enter the URL
		driver.get("https://www.google.com");
		
		//get Title 
		System.out.println(driver.getTitle());
		
		//validation of title 
		if (driver.getTitle().equals("Google"))
		{
			System.out.println("Title is correct");
		}
		else System.out.println("Title is wrong");
		//get Pagesource
		//System.out.println(driver.getPageSource());
		
		//get CurrentURL
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		//To quit the browser 
 
		//driver.quit();
	}

}
