import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		//Take screenShot and store as file formate
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//new copy of method to store to desire location 
		FileHandler.copy(file, new File("C:\\Users\\Khurram\\eclipse-workspace\\selenium\\SeleniumPractice\\src\\ScreenShot\\google.png"));
	}

}
