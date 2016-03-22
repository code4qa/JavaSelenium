/*
 * Title:		QuoteEntryPageObjects.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class contains methods returning WebElement objects for the navigable Page Objects on the 'Quote Entry' web page or section of the B&D web site.
 * 				These methods are used principally by the associated ~PageActions class.
 */

package bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class QuoteEntryPageObjects extends BaseClass {
	
	public static String pageTitle() {
		return "B&D - Quote";
	}
	
	public static WebElement symbol() {
		return driver.findElement(By.name("symbol"));
	}
	
	public static WebElement getQuoteButton() {
		// <input type="image" border="0" tabindex="2" alt="Get Quote" src="images/get-quote.gif"/>
		return driver.findElement(By.xpath("html/body//form//input[@type='image' and @alt='Get Quote']"));
	}
	
	public static WebElement symbolLookupLink() {
		/*
		<a href="javascript:Popup('lookup', 'symbol_lookup.asp', 500, 500, 0);" tabindex="3">
		    <img border="0" alt="Symbol Lookup" src="images/symbol-lookup.gif"/>
		</a>
		*/
		
		return driver.findElement(By.xpath("html/body//form//img[@alt='Symbol Lookup']/.."));
	}


}
