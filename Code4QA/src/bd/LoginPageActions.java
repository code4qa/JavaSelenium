/*
 * Title:		LoginPageActions.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This class principally uses the methods of the associated ~PageObjects class 
 * 				Normally the methods take actions on the B&D web site for the 'Login' web page or section to complete a test process and return nothing.
 */

package bd;

public class LoginPageActions extends BaseClass {
	
	public static void assertTitle() {
		Utils.assertTitle(LoginPageObjects.pageTitle());
	}	
	
	public static void checkCustomerLoginTitle() {
		System.out.println("Checking the Customer Login Title...");
		// By navigating to the elements they are checked, if it cannot navigate to an element, then selenium returns an error.
//		System.out.println( "getText() = " + LoginPageObjects.customerLoginTitle().getText() );
//		System.out.println( "getTagName() = " + LoginPageObjects.customerLoginTitle().getTagName() );
		System.out.println( "getAttribute(\"alt\") = " + LoginPageObjects.customerLoginTitle().getAttribute("alt"));
	}
	
	public static void enterUserName() {
		System.out.println("Clearing the User Name...");
		LoginPageObjects.userName().clear();
		
		System.out.println("Entering the User Name...");
		LoginPageObjects.userName().sendKeys(loginUserName);
	}
	
	public static void enterPassword() {
		System.out.println("Entering the Password...");
		LoginPageObjects.password().sendKeys(loginPassword);
	}

	public static void clickLoginButton() {
		System.out.println("Clicking on the Login Button...");
		LoginPageObjects.loginButton().click();
	}
}
