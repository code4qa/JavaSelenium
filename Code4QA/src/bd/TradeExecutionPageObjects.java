/*
 * Title:		TradeExecutionPageObjects.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class contains methods returning WebElement objects for the navigable Page Objects on the 'Trade Execution' web page or section of the B&D web site.
 * 				These methods are used principally by the associated ~PageActions class.
 */

package bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TradeExecutionPageObjects extends BaseClass {
	
	public static String pageTitle() {
		return "Trade Execution";
	}
	
	public static String orderExectionTextExpected() {
		return "Thank you. Your order has been placed.";
	}
	
	public static WebElement orderExecutionTextActual() {
		/*
		<td width="491" valign="top">
		<br/>
		Thank you. Your order has been placed.
		</td>
		*/
	
		// Looks like a broken <br> tag is preventing me from doing a direct match on the text.
		// However, I can extract the text and see what it looks like.
		
		return driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td[4]"));
	}

}
