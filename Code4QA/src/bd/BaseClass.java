/*
 * Title:		BaseClass.java
 * Author:		Mark Twomey (code4qa.github.io)
 * Synopsis:	This is the base class for testing of the B&D web site.
 * 				All ~PageObjects and ~PageActions classes extend this class so that any key global information is shared easily such as the WebDriver (driver).
 * 
 * 				Note 1: I am using class variables (static) and so not instanciating any objects.
 * 				Note 2: The package name 'bd' refers to the web site under test, the ficticious Brown and Donaldson trading firm.
 */

package bd;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	public static WebDriver driver;
	
	// Possibly move these to properties
	public static String baseURL = "http://bdonline.sqe.com/"; // This can be http or https, the B&D site has both.
	public static int driverTimeOutSecsDefault = 30;
	
	// Pickup from the command line when running the Java application:  -D<propertyName> 
	// Can be set in Eclipse Run Configurations, under Arguments, VM Arguments.
	public static String loginUserName = System.getProperty("bdLoginUserId");  
	public static String loginPassword = System.getProperty("bdLoginPassword");
}
