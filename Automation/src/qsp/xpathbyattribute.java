	package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattribute {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}

public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(6000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone 15");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Midnight, 128 GB)']")).click();
	Thread.sleep(5000);
	driver.quit();
}



}
