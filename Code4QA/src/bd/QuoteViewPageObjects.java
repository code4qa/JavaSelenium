/*
 * Title:		QuoteViewPageObjects.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class contains methods returning WebElement objects for the navigable Page Objects on the 'Quote View' web page or section of the B&D web site.
 * 				These methods are used principally by the associated ~PageActions class.
 */

package bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class QuoteViewPageObjects  extends BaseClass {
	
	public static String pageTitle() {
		return "Quote View";
	}
	
	public static WebElement viewQuoteBody() {
		return driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[4]"));
	}

}
