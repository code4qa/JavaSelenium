/*
 * Title:		TradeExecutionPageActions.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class principally uses the methods of the associated ~PageObjects class 
 * 				Normally the methods take actions on the B&D web site for the 'Trade Execution' web page or section to complete a test process and return nothing.
 */

package bd;

import static org.testng.Assert.assertEquals;

public class TradeExecutionPageActions extends BaseClass {
	
	public static void assertTitle() {
		Utils.assertTitle(TradeExecutionPageObjects.pageTitle());	
	}
	
	public static String getOrderExecutionText() {
		return TradeExecutionPageObjects.orderExecutionTextActual().getText();
	}

	public static void printOrderExecutionText() {
		System.out.println( "------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println( "getOrderExecutionText()" );
		System.out.println( getOrderExecutionText() );
		System.out.println( "------------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public static void assertOrderExecutionText() {
		String expectedText = TradeExecutionPageObjects.orderExectionTextExpected();
		System.out.println("Checking assertion on the trade execution. Expected Text = " + expectedText);
		assertEquals( expectedText, getOrderExecutionText());
		
	}
	
	
	
}
