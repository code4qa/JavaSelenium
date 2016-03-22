/*
 * Title:		MarkNewsPageActions.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class principally uses the methods of the associated ~PageObjects class 
 * 				Normally the methods take actions on the B&D web site for the 'Market News' web page or section to complete a test process and return nothing.
 */

package bd;

public class MarketNewsPageActions extends BaseClass {
	
	public static void assertTitle() {
		Utils.assertTitle(MarketNewsPageObjects.pageTitle());	
	}
	
	public static String getMarketNewsFedReducesRate() {
		return MarketNewsPageObjects.marketNewsFedReducesRate().getText();
	}
	
	public static String getMarketNewsTelecomStocksSoar() {
		return MarketNewsPageObjects.marketNewsTelecomStocksSoar().getText();
	}
	
	public static String getMarketNewsAll() {
		return MarketNewsPageObjects.marketNewsAll().getText();
	}
	
	public static void printMarketNews() {
		System.out.println( "Here is the Market News:");
		System.out.println( "------------------------");
		System.out.println( MarketNewsPageActions.getMarketNewsAll() );
		System.out.println( "------------------------------------------------------------------------------------------------------------------------------------------------");
	}

}
