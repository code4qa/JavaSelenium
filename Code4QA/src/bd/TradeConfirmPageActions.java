/*
 * Title:		TradeConfirmPageActions.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class principally uses the methods of the associated ~PageObjects class 
 * 				Normally the methods take actions on the B&D web site for the 'Trade Confirm' web page or section to complete a test process and return nothing.
 */

package bd;

public class TradeConfirmPageActions extends BaseClass {
	
	public static void assertTitle() {
		Utils.assertTitle(TradeConfirmPageObjects.pageTitle());	
	}
	
	public static String getOrderInformationText() {
		return TradeConfirmPageObjects.orderInformationText().getText();
	}

	public static void printOrderInformationText() {
		System.out.println( "------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println( getOrderInformationText() );
		System.out.println( "------------------------------------------------------------------------------------------------------------------------------------------------");

	}
	
	public static String getEstimatedOrderValueText() {
		return TradeConfirmPageObjects.estimatedOrderValueText().getText();
	}

	public static void printEstimatedOrderValueText() {
		System.out.println("printEstimatedOrderValueText()");
		System.out.println( getEstimatedOrderValueText() );
	}
	
	public static void clickPlaceOrderButton() {
		System.out.println("Clicking the 'Place Order' Button.");
		TradeConfirmPageObjects.placeOrderButton().click();
	}
	
	public static void clickVoidOrderButton() {
		System.out.println("Clicking the 'Void Order' Button.");
		TradeConfirmPageObjects.voidOrderButton().click();
	}

}