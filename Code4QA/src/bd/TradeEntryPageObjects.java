/*
 * Title:		TradeEntryPageObjects.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class contains methods returning WebElement objects for the navigable Page Objects on the 'Trade Entry' web page or section of the B&D web site.
 * 				These methods are used principally by the associated ~PageActions class.
 */

package bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TradeEntryPageObjects extends BaseClass {
	
	public static String pageTitle() {
		return "B&D - Trade";
	}
	
	public static WebElement orderTypeBuy() {
		return driver.findElement(By.xpath("html/body//form//input[@type='radio' and @name='ordertype' and @value='BUY']"));
	}
	
	public static WebElement orderTypeSell() {
		return driver.findElement(By.xpath("html/body//form//input[@type='radio' and @name='ordertype' and @value='SELL']"));
	}
	
	public static WebElement symbol() {
		return driver.findElement(By.name("symbol"));
	}
	
	public static WebElement quantity() {
		return driver.findElement(By.name("quantity"));
	}
	
	public static WebElement placeTradeButton() {
		return driver.findElement(By.xpath("html/body//form//input[@type='image' and @alt='Place Trade']"));
	}

}
