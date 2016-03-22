/*
 * Title:		ViewHoldingsPageActions.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class principally uses the methods of the associated ~PageObjects class 
 * 				Normally the methods take actions on the B&D web site for the 'View Holdings' web page or section to complete a test process and return nothing.
 */

package bd;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class ViewHoldingsPageActions {
	
	public static void assertTitle() {
		Utils.assertTitle(ViewHoldingsPageObjects.pageTitle());	
	}
	
	public static String getViewHoldingsBodyText() {
		System.out.println("Getting the View Holdings Body (text)...");
		
		return ViewHoldingsPageObjects.viewHoldingsBody().getText();
	}
	
	public static void printViewHoldingsBodyText() {
		System.out.println( "------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println( getViewHoldingsBodyText() );
		System.out.println( "------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	
	public static String getCashRemainingText() {
		System.out.println("Getting the Cash Remaining (text)...");
		
		return ViewHoldingsPageObjects.cashRemainingField().getText();
	}
	
	public static void printCashRemainingText() {
		System.out.println("The Cash Remaining is = " + getCashRemainingText() );
	}
	
	
	public static void verifyCashRemainingText(String compareCashTxt) { 
		assertEquals(getCashRemainingText(), compareCashTxt); 
	}
	

	
	public static void verifyIfHaveHoldingOfTicker(String tickerSymbol, String expectedQty) { 
		String haveHoldingsTicker = ViewHoldingsPageObjects.haveHoldingsOfTicker(tickerSymbol).getText();
		String haveHoldingsQty = ViewHoldingsPageObjects.getHoldingsQtyOfTicker(tickerSymbol).getText().trim();
		
		System.out.println("Verifying that I have holdings of Ticker = " + haveHoldingsTicker + " with an expected quantity of " + expectedQty);
		assertEquals(haveHoldingsQty, expectedQty); 
	}
	
	public static void verifyIfNoHoldingOfTicker(String tickerSymbol) {
		Utils.changeDriverTimeOutSeconds(3);
		
		Boolean foundHoldingOfTicker = false;

		try {
			foundHoldingOfTicker = ViewHoldingsPageObjects.haveHoldingsOfTicker(tickerSymbol).isDisplayed();
			fail("ERROR: In verifyIfNoHoldingOfTicker() I should not have found any holdings for ticker " + tickerSymbol);
		} catch (Exception e) {
			
			System.out.println("As expected, I cannot find any holdings of Ticker = " + tickerSymbol );
		} finally {
			if (foundHoldingOfTicker) {
				System.out.println("Unexpectedly I have " + ViewHoldingsPageObjects.getHoldingsQtyOfTicker(tickerSymbol).getText() + " holdings of Ticker " + tickerSymbol );
			}
			
			Utils.setInitialDriverTimeOutSeconds();
			
		}

			
	
	}
	


}
