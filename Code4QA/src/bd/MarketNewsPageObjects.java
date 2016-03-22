/*
 * Title:		MarketNewsPageObjects.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class contains methods returning WebElement objects for the navigable Page Objects on the 'Market News' web page or section of the B&D web site.
 * 				These methods are used principally by the associated ~PageActions class.
 */

package bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MarketNewsPageObjects extends BaseClass {
	
	
	public static String pageTitle() {
		return "B&D - Market News";
	}
	
	public static WebElement marketNewsFedReducesRate() {
		return driver.findElement(By.xpath("html/body/table//*[contains(text(),'Fed Reduces Rate')]/../.."));
	}
	
	public static WebElement marketNewsTelecomStocksSoar() {
		return driver.findElement(By.xpath("html/body/table//*[contains(text(),'Telecommunications Stocks Soar')]/../.."));
	}

	public static WebElement marketNewsAll() {
		return driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[4]/table/tbody/tr[2]"));
	}

}
