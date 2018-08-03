import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeBrowser {

	public static void main(String[] args) 
	{
		/*
		 * Notes -  1.Chrome version in mac should be 59 and above and windows 60 and above
		 * 2.Window size should be 1400 , 800 (To avoid element not function exception)
		 *  
		 */
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");
			
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("window-size=1400,800");
		 options.addArguments("headless");
			WebDriver driver = new ChromeDriver(options);
			driver.get("http://www.freecrm.com");
		      System.out.println(driver.getTitle());
		      driver.findElement(By.name("username")).sendKeys("sheikh");
		      driver.findElement(By.name("password")).sendKeys("sheikh");
		      driver.findElement(By.xpath("//input[@value = 'Login']")).submit();
		      System.out.println(driver.getTitle());

	}

}
