/*
 * Title:		LoginPageObjects.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class contains methods returning WebElement objects for the navigable Page Objects on the 'Login' web page or section of the B&D web site.
 * 				These methods are used principally by the associated ~PageActions class.
 */

package bd;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class LoginPageObjects extends BaseClass {
	
	public static String pageTitle() {
		return "B&D - Login Page";
	}
	
	public static WebElement customerLoginTitle() {
		/*
		<td width="516" valign="top" colspan="4">
		<img width="1" height="28" alt="" src="images/spacer.gif"/>
		<br/>
		<img alt="Cusotmer Login" src="images/customer-login.gif"/>
		</td>
		*/
		
		return driver.findElement(By.xpath("html/body/form//img[@alt='Cusotmer Login']"));   // NOTE: Typo Error in HTML Code!!
	}
	
	public static WebElement userName() {
		return driver.findElement(By.name("login"));
	}
	
	public static WebElement password() {
		return driver.findElement(By.name("password"));
	}
	
	public static WebElement loginButton() {
		// <input type="image" border="0" tabindex="3" alt="Login" src="images/login-and-arrows.gif"/>
		return driver.findElement(By.xpath("html/body/form//input[@type='image' and @alt='Login']"));
	}
	
	public static String loginPageURL() {
		return "http://bdonline.sqe.com/login.asp";
	}


	
}