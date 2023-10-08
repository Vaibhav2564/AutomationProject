package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleElement {
static {
	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
	int count = alllinks.size();
	System.out.println(count);
	for (int i = 0; i < count; i++) {
		String text = alllinks.get(i).getText();
		System.out.println(text);
	}
	Thread.sleep(4000);
	driver.close();
}




}
