/*
 * Title:		TradeEntryPageActions.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class principally uses the methods of the associated ~PageObjects class 
 * 				Normally the methods take actions on the B&D web site for the 'Trade Entry' web page or section to complete a test process and return nothing.
 */

package bd;

import static org.testng.Assert.fail;

public class TradeEntryPageActions extends BaseClass {
	
	public static void assertTitle() {
		Utils.assertTitle(TradeEntryPageObjects.pageTitle());	
	}
	
	public static void doOrderSimple(String tradeType, String tickerSymbol, String orderQtyText) {
		System.out.println("Trade Entry: " + tradeType + " : Symbol= " + tickerSymbol + " : Quantity= " + orderQtyText);  
		
		if (tradeType.equalsIgnoreCase("BUY")) {
			TradeEntryPageObjects.orderTypeBuy().click();
		} else if (tradeType.equalsIgnoreCase("SELL")) {
			TradeEntryPageObjects.orderTypeSell().click();
		} else {
			fail("In doOrderSimple() tradeType must be either BUY or SELL only!");
		}
		
		TradeEntryPageObjects.symbol().sendKeys(tickerSymbol);
		TradeEntryPageObjects.quantity().sendKeys(orderQtyText);
		TradeEntryPageObjects.placeTradeButton().click();
	}
	
	public static void buyOrderSimple(String tickerSymbol, String quantityTxt) {
		doOrderSimple("BUY", tickerSymbol, quantityTxt);
	}
	
	public static void sellOrderSimple(String tickerSymbol, String quantityTxt) {
		doOrderSimple("SELL", tickerSymbol, quantityTxt);
	}
	
}

