package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwdbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
	//utilization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//initization

	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwdbx() {
		return pwdbx;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}
	
	
	
}
