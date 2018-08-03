import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSMethods {

	public static void main(String[] args) throws InterruptedException 
	{
       System.setProperty("webdriver.chrome.driver", "D:\\SeleniumPratice\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com");
		
		WebElement login_Button = driver.findElement(By.xpath("//input[contains(@type , 'submit')]"));
		
		//highlight element 
		drawBoarder(driver, login_Button);
		
		Thread.sleep(5000);
		
		//Generating alert pop-up
		//generateAlert(driver, "Bug in the login button");
		
		//To click on element using JS
		clickElementByJs(driver, login_Button);
		
		//Refresh the page using JS
		refreshPageByJs(driver);
		
		//Get title by JS
		System.out.println(getTitleByJs(driver));
		
		//Get getPageInnerText 
		System.out.println(getPageInnerText(driver));
		
		//ScrollDown in page 
		//scrollPageDown(driver);
		
		WebElement forget_Password = driver.findElement(By.xpath("//a[contains(text() , 'Forgot Password?')]"));
		//Scroll into View 
		scroll_Into_View(driver, forget_Password);
	}
   
	 public static void drawBoarder (WebDriver driver, WebElement element)
	 {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].style.border = '3px solid red'", element);
	 }
	 public static void generateAlert(WebDriver driver , String message)
	 {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("alert('"+message+"')");
	 }
	 public static void clickElementByJs (WebDriver driver , WebElement element)
	 {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", element);
	 }
	 public static void refreshPageByJs (WebDriver driver)
	 {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("history.go(0)");
	 }
	 public static String getTitleByJs(WebDriver driver)
	 {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 return js.executeScript("return document.title;").toString();
	 }
	 public static String getPageInnerText(WebDriver driver)
	 {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 return js.executeScript("return document.documentElement.innerText;").toString();
	 }
	 public static void scrollPageDown (WebDriver driver)
	 {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	 }
	 public static void scroll_Into_View(WebDriver driver , WebElement element)
	 {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);" , element);
	 }
	 
}
