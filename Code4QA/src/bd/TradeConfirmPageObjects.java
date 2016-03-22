/*
 * Title:		TradeConfirmPageObjects.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class contains methods returning WebElement objects for the navigable Page Objects on the 'Trade Confirm' web page or section of the B&D web site.
 * 				These methods are used principally by the associated ~PageActions class.
 */

package bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TradeConfirmPageObjects extends BaseClass {
	
	public static String pageTitle() {
		return "Confirm Trade";
	}
	
	public static WebElement orderInformationText() {
		
		// This is the block of text of the order information, it starts with a heading that looks like this:
		//     	Please verify your order information below, then click Place Order. 
		// But is actually badly formatted as below. 
		// 
		// This text following the heading contains the full details of the 'Order' and the 'Quote' and also the 'estimated trade value'.
		
		/*
		<td height="35" colspan="5">
		<font face="Arial,Helvetica" size="2">Please                   verify your order information below, then click Place Order.                   </font>
		<p>
		<font face="Arial,Helvetica" size="2"/>
		</p>
		</td>
		*/
		
		return driver.findElement(By.xpath("html/body//*[contains(text(),'then click Place Order.')]/../../.."));
	}
	
	public static WebElement estimatedOrderValueText() {
		/*
		<p>
		<font face="Arial,Helvetica" size="2">
		<br/>
		The estimated value of this trade with commission and fees: $363.78
		</font>
		</p>
		*/
		
		return driver.findElement(By.xpath("html/body//*[contains(text(),'The estimated value of this trade')]"));
	}
	
	public static WebElement placeOrderButton() {
		// <input type="submit" name="submit" value="Place Order" tabindex="10"/>
		
		return driver.findElement(By.xpath("html/body//form//input[@type='submit' and @name='submit']"));
	}
	
	public static WebElement voidOrderButton() {
		// <input type="button" onclick="document.voidform.submit();" name="cancel" value="  Void  " tabindex="11"/>
		
		return driver.findElement(By.xpath("html/body//form//input[@type='button' and @name='cancel']"));
	}
	
}
