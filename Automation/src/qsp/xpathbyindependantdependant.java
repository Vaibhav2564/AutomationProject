package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyindependantdependant {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("Iphone 14");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Midnight, 128 GB)']/../../../div[2]/div[2]/div[1]/div[1]/div[1]")).click();
Thread.sleep(5000);



}







}
