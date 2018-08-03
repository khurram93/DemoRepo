import org.openqa.selenium.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.WebDriver;


public class HeadLessBrowsers {

	public static void main(String[] args) 
	{
	     /*Notes :-  Testing is happening  behind the scene no browser is launched
	      * 1.Headless browser is also called as Ghost browsers 
	      * 2.Headless browser are fast compared to other navigation browsers
	      * 3.Limitations :- We can't perform Drag and drop , ScreenShot ,Using Action class , Double click
	      * 4.It is best use for sanity and smoke testing
	      * 5.HtmlUnitDriver is not available from the selenium 3.x series we have to download the external jar
	      */
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("http://www.freecrm.com");

		System.out.println(driver.getTitle());
	}

}
