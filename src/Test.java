import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");
		  
		//Launch the chrome
		WebDriver driver = new ChromeDriver();	

		driver.manage().window().maximize();
		 //Enter the URL
		driver.get("https://www.juegostudio.com");
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//ul[@id = 'menu-mainmenu']//a[text() = 'Services']"))).perform();
		driver.findElement(By.xpath("//ul[@id = 'menu-mainmenu']//a[text() = 'MOBILE  GAME DEVELOPMENT']")).click();
		

	}

}
