package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextMethod {
 static {
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
 }
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps ')]")).getText();
	System.out.println(text);
	Thread.sleep(5000);
	driver.close();
	
}
 
 
 
}
