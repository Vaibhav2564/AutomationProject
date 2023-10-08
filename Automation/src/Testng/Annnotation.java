package Testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annnotation {

	
	@BeforeSuite
	public void datbaseconnection() {
		Reporter.log("database connected",true);
	}
	@BeforeTest
	public void browserlaunched() {
		Reporter.log("browser launched",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("Logged in succesfully",true);
	}
	@Test
	public void createcustomer() {
		Reporter.log("customer created",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logged out succesfully",true);
	}
	@AfterTest
	public void browserclose() {
		Reporter.log("browser closed",true);
	}
	@AfterSuite
	public void databasedisconneted() {
		Reporter.log("database disconnected",true);
	}
}
