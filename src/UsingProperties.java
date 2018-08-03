import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingProperties {
  static WebDriver driver;
	public static void main(String[] args) throws IOException 
	{
		
		Properties prop = new Properties();
		
		FileInputStream file = new FileInputStream("C:\\Users\\Khurram\\eclipse-workspace\\selenium\\SeleniumPractice\\src\\config.properties");
		
		prop.load(file);
         
		switch (prop.getProperty("browser"))
		{
		case "chrome" : 
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case  "FF" : 
			System.setProperty("webdriver.gecko.driver", "D:\\SeleniumPratice\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input [@class = 'btn btn-small']")).submit();
	}

}
