
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class SikuiTestYT {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
	      driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      
	      driver.get("https://www.youtube.com/watch?v=m3zZZC0tLdg");
	      
	      //Testing for flash objects 
	      
	      Screen s = new Screen();
	      
	      //For clicking operation
	      Pattern pause = new Pattern("PauseYT.PNG");
	      s.wait(pause, 2000);
          s.click();
          
          //For clicking on pause button
          Pattern play = new Pattern("playYT.PNG");
	      s.wait(play, 2000);
          s.click();
          
          //Cicking on setting button 
          Pattern setting = new Pattern("SettingYT.PNG");
	      s.wait(setting, 2000);
          s.click();
          
          //Navigating to Gmail page 
          driver.navigate().to("https://accounts.google.com/signin");
          
          //Entering the email ID 
          Pattern emailID = new Pattern("C:\\Users\\Khurram\\Desktop\\Sikuli\\email.PNG");
	      s.wait(emailID, 2000);
          s.type(emailID, "sheik.kurram93");
          
          Pattern next = new Pattern("C:\\Users\\Khurram\\Desktop\\Sikuli\\NextButton.PNG");
	      s.wait(next, 2000);
          s.click();
          
	}
}