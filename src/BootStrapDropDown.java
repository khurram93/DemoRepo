import java.util.List;
import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      
	      driver.get("https://www.jquery-az.com/jquery/demo.php?ex=152.0_1");
	      
	      driver.findElement(By.id("btndropdown")).click();
	      
	      List<WebElement> list = driver.findElements(By.xpath("//button[@id ='btndropdown']//following-sibling::ul//li//label[@class ='radio-btn']//input"));
	      
	      System.out.println(list.size());
	      
	     for (int i =0 ;i<list.size();i++)
	     {
	    	 
	    	 if (!list.get(i).isSelected())
	    	 {
	    		 list.get(i).click();
	    	 }
	    	 
	     }

	}

}
