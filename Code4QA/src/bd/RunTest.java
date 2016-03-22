/*
 * Title:		RunTest.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This is the class containing the main() for testing of the B&D web site.
 * 				NOTE 1: Currently I am not driving it from TestNG, whose ability I will add in the next version.
 * 				NOTE 2: These few test cases below are my initial trial setup, later I will expand them more fully.
 */

package bd;

public class RunTest extends BaseClass {

//	@Test
	public static void main(String[] args) throws InterruptedException {

		// START TEST 
		// ==========
		
		startAndLogin();
		
		/* TEST 1
		 * ======
		 * Get the Market News
		 * View the holdings and cash
		 */
		
		initialPageMarketNews();
		
		viewHoldingsAndShowCash();
		
		/* TEST 2
		 * ======
		 * Get Some Trade Quotes
		 */
		
		getAQuoteForTicker("IBM"); // International Business Machines
		getAQuoteForTicker("CAT"); // Caterpillar, Inc.
		
		/* 
		 * TEST 3
		 * ======
		 * Buy 5 IBM and show holdings.
		 * Buy 2 CAT and show holdings.
		 * Get a quote for WAG, just to test breaking up the process in the middle.
		 * Sell 2 IBM
		 * Verify IBM holdings, should be 5-2=3.
		 * Sell 2 CAT 
		 * Verify CAT holdings, should be 2-2=0.
		 * Sell 3 IBM
		 * Verify IBM holdings, should be 3-3-0.
		 */
		
		tradeEntryAndConfirmAndExecution("BUY",  "IBM", "5");
		verifyHoldingsAndShowCash("IBM","5");
		
		tradeEntryAndConfirmAndExecution("BUY",  "CAT", "2");
		verifyHoldingsAndShowCash("CAT","2");
		
		getAQuoteForTicker("WAG"); // Walgreen Company
		
		tradeEntryAndConfirmAndExecution("SELL", "IBM", "2");
		verifyHoldingsAndShowCash("IBM","3");
		
		tradeEntryAndConfirmAndExecution("SELL",  "CAT", "2");
		verifyNoHoldingsAndShowCash("CAT");
		
		tradeEntryAndConfirmAndExecution("SELL",  "IBM", "3");
		verifyNoHoldingsAndShowCash("IBM");
		
		// STOP TEST 
		// =========
		
		testLogoutAndStop();
	}
	
	
//	@BeforeSuite
	public static void startAndLogin() {
		Utils.startBrowser();

		// Start Page
		StartPageActions.navigateToURL();
		StartPageActions.assertTitle();
		StartPageActions.getFooterMsg();
		StartPageActions.clickLoginLink();

		// Login
		LoginPageActions.assertTitle();
		LoginPageActions.checkCustomerLoginTitle();
		LoginPageActions.enterUserName();
		LoginPageActions.enterPassword();
		LoginPageActions.clickLoginButton();
	}
	
	
	public static void initialPageMarketNews() {
		
		// Initial Page after Login is Market News
		// Side Menu is on all pages after Login
		
		MarketNewsPageActions.assertTitle();
		MarketNewsPageActions.printMarketNews();          
	}
	
	
	public static void viewHoldingsAndShowCash() {
		// Check the  Holdings 
		SideMenuPageActions.clickViewHoldingsLink();
		
		ViewHoldingsPageActions.printViewHoldingsBodyText();
		ViewHoldingsPageActions.printCashRemainingText();
	}
	
	
	public static void verifyHoldingsAndShowCash(String tickerSymbol, String expectedQty) {
		viewHoldingsAndShowCash();
		
		ViewHoldingsPageActions.verifyIfHaveHoldingOfTicker(tickerSymbol, expectedQty);
	}
	
	public static void verifyNoHoldingsAndShowCash(String tickerSymbol) {
		viewHoldingsAndShowCash();
				
		ViewHoldingsPageActions.verifyIfNoHoldingOfTicker(tickerSymbol);
	}
	
	

	
	public static void tradeEntryAndConfirmAndExecution(String tradeType, String tickerSymbol, String orderQtyText) { 
		// Choose to do a trade
		SideMenuPageActions.clickTradeLink();
		
		// Trade Page Entry
		TradeEntryPageActions.assertTitle();
		TradeEntryPageActions.doOrderSimple(tradeType, tickerSymbol, orderQtyText);

		
		// Confirm the trade
		TradeConfirmPageActions.assertTitle();
		TradeConfirmPageActions.printOrderInformationText();
//		TradeConfirmPageActions.clickVoidOrderButton();
		TradeConfirmPageActions.clickPlaceOrderButton();
		
		// Trade Execution page
		TradeExecutionPageActions.assertTitle();
		TradeExecutionPageActions.printOrderExecutionText();
		TradeExecutionPageActions.assertOrderExecutionText();
	}
	
	
	
	public static void getAQuoteForTicker(String tickerSymbol) {
		SideMenuPageActions.clickQuoteLink();
		
		QuoteEntryPageActions.assertTitle();
		QuoteEntryPageActions.enterQuoteTickerSymbol(tickerSymbol);
		QuoteEntryPageActions.clickGetQuoteButton();
		
		QuoteViewPageActions.assertTitle();
		QuoteViewPageActions.printQuoteBodyText();
	}
	
	
//	@AfterSuite()
	public static void testLogoutAndStop() throws InterruptedException {
		// Logout 
		SideMenuPageActions.clickLogoutLink();

		LoginPageActions.assertTitle();
		
		Utils.stopBrowser();
	
	}
	

}
