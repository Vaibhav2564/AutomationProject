package Testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplementation.class)
public class CreateCustomer extends Baseclass {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

	@Test
	public void create() {
		Assert.fail();
		Reporter.log("Create customer",true);
	}
	
	
	
	
	
}
