package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipleselectlistbox {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

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
	s.deselectByIndex(2);
	Thread.sleep(2000);
	s.deselectByVisibleText("vada pav");
	Thread.sleep(2000);
	s.deselectByValue("kr");
	Thread.sleep(2000);
	WebElement menu1 = driver.findElement(By.id("menu"));
	Select s1=new Select(menu1);
	s1.selectByIndex(0);
	Thread.sleep(2000);
	s1.selectByValue("cb");
	Thread.sleep(2000);
	s.deselectAll();
	
}
}
