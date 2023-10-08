package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getalloption {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.get("file:///C:/Users/hp/Desktop/Automation%20Testing/Hotel%20Shabnam.html");
	WebElement menu = driver.findElement(By.id("menu"));
	Select s=new Select(menu);
	List<WebElement> alloption = s.getOptions();
	int count = alloption.size();
	System.out.println(count);
	for (int i = 0; i < count; i++) {
		String text = alloption.get(i).getText();
		System.out.println(text);
	}
	driver.close();	
}
}
