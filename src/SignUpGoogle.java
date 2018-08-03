import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpGoogle {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/b/0/SignUp?service=mail");
      
		driver.findElement(By.id("firstName")).sendKeys("khurram");
		
		driver.findElement(By.id("lastName")).sendKeys("sharuk");
		
		driver.findElement(By.id("username")).sendKeys("Test3232");
		
		driver.findElement(By.name("Passwd")).sendKeys("asdf12345@#");
		
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("asdf12345@#");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span [text() = 'Next']")).click();
	}

}
