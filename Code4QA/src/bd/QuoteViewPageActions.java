/*
 * Title:		QuoteViewPageActions.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class principally uses the methods of the associated ~PageObjects class 
 * 				Normally the methods take actions on the B&D web site for the 'Quote View' web page or section to complete a test process and return nothing.
 */

package bd;

public class QuoteViewPageActions {
	
	
	public static void assertTitle() {
		Utils.assertTitle(QuoteViewPageObjects.pageTitle());	
	}
	
	public static String getQuoteBodyText() {
		System.out.println("Getting the Quote Body (text)...");
		
		return QuoteViewPageObjects.viewQuoteBody().getText();
	}
	
	public static void printQuoteBodyText() {
		System.out.println( "------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println( getQuoteBodyText() );
		System.out.println( "------------------------------------------------------------------------------------------------------------------------------------------------");
	}

}
