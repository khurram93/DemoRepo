import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFF {

	public static void main(String[] args)
	{
	  System.setProperty("webdriver.gecko.driver", "D:\\SeleniumPratice\\geckodriver\\geckodriver.exe");
	  
	  WebDriver driver = new FirefoxDriver();
           
	  driver.get("https://www.google.com");
	  
	  System.out.println(driver.getTitle());
	  
	  String URL = driver.getCurrentUrl();
	  System.out.println(URL);
	  
	  driver.quit();
	}

}
