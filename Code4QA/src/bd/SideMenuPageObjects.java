/*
 * Title:		SideMenuPageObjects.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class contains methods returning WebElement objects for the navigable Page Objects on the 'Side Menu' web page or section of the B&D web site.
 * 				These methods are used principally by the associated ~PageActions class.
 */

package bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SideMenuPageObjects extends BaseClass {

	
	// ---------- HOME ----------
	
	public static WebElement marketNewsLink() {
		return driver.findElement(By.name("market_news"));
	}
	
	// ---------- YOUR ACCOUNT ---------- 
	
	public static WebElement viewHoldingsLink() {
		return driver.findElement(By.name("view_holdings"));
	}
	
	public static WebElement tradeLink() {
		return driver.findElement(By.name("trade"));
	}
	
	public static WebElement viewOpenOrdersLink() {
		return driver.findElement(By.name("orders"));
	}
	
	public static WebElement changePasswordLink() {
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement LogoutLink() {
		return driver.findElement(By.name("logout"));
	}
	
	// ---------- RESEARCH ---------- 
	
	public static WebElement quoteLink() {
		return driver.findElement(By.name("quote"));
	}
	
	// ---------- SUPPORT ---------- 
	
	public static WebElement helpLink() {
		return driver.findElement(By.name("help"));
	}
	
	public static WebElement glossaryLink() {
		return driver.findElement(By.name("glossary"));
	}
	
	public static WebElement siteMapLink() {
		return driver.findElement(By.name("site_map"));
	}
	
	// ---------- CORPORATE INFO ---------- 
	
	public static WebElement aboutLink() {
		return driver.findElement(By.name("about"));
	}
	
	
}
