import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop {

	public static void main(String[] args)
	{
        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		
		
		Alert alert = driver.switchTo().alert();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//To get pop-up text 
		System.out.println(alert.getText());
		
		// to accept the pop-up
		alert.accept();
		
		//to decline the pop-up
		//alert.dismiss();
	}

}
