/*
 * Title:		SideMenuPageActions.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class principally uses the methods of the associated ~PageObjects class 
 * 				Normally the methods take actions on the B&D web site for the 'Side Menu' web page or section to complete a test process and return nothing.
 */

package bd;

public class SideMenuPageActions {
	
	public static void clickViewHoldingsLink() {
		System.out.println("Clicking on the View Holdings Link...");
		SideMenuPageObjects.viewHoldingsLink().click();
	}
	
	public static void clickTradeLink() {
		System.out.println("Clicking on the Trade Link...");
		SideMenuPageObjects.tradeLink().click();
	}
	
	
	public static void clickQuoteLink() {
		System.out.println("Clicking on the Quote Link...");
		SideMenuPageObjects.quoteLink().click();
	}
	
	public static void clickLogoutLink() {
		System.out.println("Clicking on the Logout Link...");
		SideMenuPageObjects.LogoutLink().click();
	}
	
	

}
