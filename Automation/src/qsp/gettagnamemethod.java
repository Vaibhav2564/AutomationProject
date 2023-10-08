package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettagnamemethod {
 static {
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
 }
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String tag = driver.findElement(By.xpath("//img[@alt='Facebook']")).getTagName();
	System.out.println(tag);
	Thread.sleep(5000);
	driver.close();
}
 
 
}
