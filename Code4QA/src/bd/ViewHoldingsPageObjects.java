/*
 * Title:		ViewHoldingsPageObjects.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class contains methods returning WebElement objects for the navigable Page Objects on the 'View Holdings' web page or section of the B&D web site.
 * 				These methods are used principally by the associated ~PageActions class.
 */

package bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ViewHoldingsPageObjects extends BaseClass {

	public static String pageTitle() {
		return "B&D - View Holdings";
	}
	
	public static WebElement viewHoldingsBody() {
		return driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[4]"));
	}
	
	public static WebElement cashRemainingField() {
		return driver.findElement(By.xpath("html/body/table//*[contains(text(),'Cash Remaining')]/../../td[2]"));
	}
	
	public static String xPathHoldingsOfTicker(String tickerSymbol) {
		String xpathPattern = "//a[contains(@href,'symbol=" + tickerSymbol + "')]";
		return xpathPattern;
	}
	
	
	public static WebElement haveHoldingsOfTicker(String tickerSymbol) {
		String xpathPattern = xPathHoldingsOfTicker(tickerSymbol);
		return driver.findElement(By.xpath(xpathPattern));
	}	
	
	public static WebElement getHoldingsQtyOfTicker(String tickerSymbol) {
		String xpathPattern = xPathHoldingsOfTicker(tickerSymbol) + "/../../td[3]";
		return driver.findElement(By.xpath(xpathPattern));
	}
	
	public static WebElement getHoldingsAcquiredOfTicker(String tickerSymbol) {
		String xpathPattern = xPathHoldingsOfTicker(tickerSymbol) + "/../../td[5]";
		return driver.findElement(By.xpath(xpathPattern));
	}

}
