import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForward {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
        
		//Navigate to other link 
		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		//Navigate back 
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		//Navigate forward 
		driver.navigate().forward();

		//Refresh the page 
		driver.navigate().refresh();
	}

}
