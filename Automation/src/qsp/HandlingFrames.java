package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/hp/Desktop/Page1.html");
	driver.findElement(By.id("Munni")).sendKeys("Q");
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	driver.findElement(By.id("Sheela")).sendKeys("J");
	Thread.sleep(2000);
	driver.switchTo().parentFrame();
	driver.findElement(By.id("Munni")).sendKeys("S");
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	driver.findElement(By.id("Sheela")).sendKeys("S");
	Thread.sleep(2000);
	driver.switchTo().parentFrame();
	driver.findElement(By.id("Munni")).sendKeys("P");
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	driver.findElement(By.id("Sheela")).sendKeys("P");
	Thread.sleep(2000);
	driver.switchTo().parentFrame();
	driver.switchTo().frame(1);
	driver.findElement(By.id("sai")).sendKeys("SSS");
	Thread.sleep(2000);
	driver.close();
}












}
