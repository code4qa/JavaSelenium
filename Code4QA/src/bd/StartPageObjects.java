/*
 * Title:		StartPageObjects.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class contains methods returning WebElement objects for the navigable Page Objects on the 'Start Page' web page or section of the B&D web site.
 * 				These methods are used principally by the associated ~PageActions class.
 */

package bd;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class StartPageObjects extends BaseClass {
	
	public static WebElement LoginLink() {
		/*  We cannot use the following: 
		      driver.findElement(By.linkText("Login for existing users")); 
		    Because there are two logins on the start page, one HTTP and one HTTPS.
		*/
		return driver.findElement(By.xpath("//a[@href='" + baseURL + "login.asp']"));   // e.g. //a[@href='https://bdonline.sqe.com/login.asp']  or http
	}

	public static String pageTitle() {
		return "The Web Testing Handbook";
	}
	
	public static WebElement StartPageFooter() {
		String expectedPageFooterContains = "All rights reserved."; // String footerMsg = "© 2000-2005 Software Quality Engineering. All rights reserved.";
		return driver.findElement(By.xpath("html/body/*[contains(text(), \"" + expectedPageFooterContains + "\")]"));
	}
	
	
}
