/*
 * Title:		StartPageActions.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class principally uses the methods of the associated ~PageObjects class 
 * 				Normally the methods take actions on the B&D web site for the 'Start Page' web page or section to complete a test process and return nothing.
 */

package bd;

import org.openqa.selenium.WebElement;

public class StartPageActions extends BaseClass {

	public static void navigateToURL() {
		System.out.println("Navigating to " + baseURL);
		driver.get(BaseClass.baseURL);
		Utils.displayURL();
	}

	public static void assertTitle() {
		Utils.assertTitle(StartPageObjects.pageTitle());	
	}
	
	public static void getFooterMsg() {
		WebElement we = StartPageObjects.StartPageFooter();
		System.out.println("Footer Message = " + we.getText() );
	}	
	
	public static void clickLoginLink() {
		System.out.println("Clicking on the Login Link...");
		StartPageObjects.LoginLink().click();
	}	
	
}
