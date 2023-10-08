package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class BaseClassImplementation extends Baseclass { 
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void createcustomer() {
		Reporter.log("Customer created successfully",true);
	}
	
}
