package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbycontainsfunction {
static {
	System.setProperty("wedriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(5000);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("HP Laptop");
	driver.findElement(By.id("nav-search-submit-text")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[contains(text(),'/AMD Ryzen 7 6800H/')]")).click();
	Thread.sleep(5000);
	driver.quit();
	
	
}

}
