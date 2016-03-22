/*
 * Title:		QuoteEntryPageActions.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class principally uses the methods of the associated ~PageObjects class 
 * 				Normally the methods take actions on the B&D web site for the 'Quote Entry' web page or section to complete a test process and return nothing.
 */

package bd;

public class QuoteEntryPageActions extends BaseClass {
	
	public static void assertTitle() {
		Utils.assertTitle(QuoteEntryPageObjects.pageTitle());	
	}
	

	public static void enterQuoteTickerSymbol(String tickerSymbol) {
		System.out.println("Entering the ticker symbol " + tickerSymbol + " to get a Trade Quote.");
		QuoteEntryPageObjects.symbol().sendKeys(tickerSymbol);
		
	}

	
	public static void clickGetQuoteButton() {
		System.out.println("Clicking the 'Get Quote' Button.");
		QuoteEntryPageObjects.getQuoteButton().click();
	}
	
	public static void clickSymbolLookupLink() {
		System.out.println("Clicking the 'Symbol Lookup' Button.");
		QuoteEntryPageObjects.symbolLookupLink().click();
	}

}