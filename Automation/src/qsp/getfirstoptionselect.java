package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.ui.Select;

public class getfirstoptionselect {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.get("file:///C:/Users/hp/Desktop/Automation%20Testing/Hotel%20Shabnam.html");
	WebElement menu = driver.findElement(By.id("menu"));
	Select s=new Select(menu);
	Thread.sleep(5000);
	s.selectByIndex(0);
	Thread.sleep(2000);
	s.selectByValue("ct");
	Thread.sleep(2000);
	s.selectByVisibleText("kepsa rice");
	Thread.sleep(2000);
	//String option = s.getFirstSelectedOption().getText();
	//System.out.println(option);
	List<WebElement> alloption = s.getAllSelectedOptions();     //store selected option
	int count = alloption.size();                 //count select option
	System.out.println(count);
	for (int i = 0; i < count; i++) {
		String text = alloption.get(i).getText();    //taking selected option visible text & print
		System.out.println(text);
		
	}
	driver.close();
}
}
