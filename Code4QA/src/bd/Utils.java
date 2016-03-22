/*
 * Title:		Utils.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This is the class containing utility functions for testing of the B&D web site.
 */

package bd;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Utils extends BaseClass {
	
	public static void startBrowser() {
		System.out.println("Opening FireFox in Web Driver.");
		
		driver = new FirefoxDriver();
		
		changeDriverTimeOutSeconds(driverTimeOutSecsDefault);
		
		System.out.println("Positioning the browser window at the top left of the screen.");
		driver.manage().window().setPosition(new Point(0,0));
		
		System.out.println("Maximizing the browser window size.");
		driver.manage().window().maximize();
	}
	
	
	public static void setInitialDriverTimeOutSeconds() {
		System.out.println("Setting Implicit Selenium find element timeout to the default value of " + driverTimeOutSecsDefault + " seconds (before exiting with an error)."); 
		driver.manage().timeouts().implicitlyWait(driverTimeOutSecsDefault, TimeUnit.SECONDS);
	}
	
	
	public static void changeDriverTimeOutSeconds(int seconds) {
		System.out.println("So that I can confirm that web elements do not exist, I am changing the Implicit Selenium find element timeout to " + seconds + " seconds."); 
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	
	public static void stopBrowser() throws InterruptedException {
		System.out.println("Closing FireFox in Web Driver.");
		
		System.out.println("Sleeping a second...");
		Thread.sleep(1000); // 1 sec

		driver.quit();	
	}
	
	
	public static void assertTitle(String expectedPageTitle) {
		
		System.out.println("Checking assertion to find the page title: " + expectedPageTitle);
		assertEquals(driver.getTitle(), expectedPageTitle);
		Utils.displayURL();
	}
	
	
	public static void displayURL() {
		System.out.println( "getCurrentUrl() = " + driver.getCurrentUrl() );
	}
	
	
	public static void dumpPageSource() {
		System.out.println( "Dumping Page Source...." );
		System.out.println( driver.getPageSource() );
	}
}
