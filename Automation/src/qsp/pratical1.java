package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pratical1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.kotaksecurities.com/");
	driver.findElement(By.linkText("Login")).click();
	Thread.sleep(4000);
	driver.findElement(By.linkText("Login to TradeSmart Terminal")).click();
	driver.findElement(By.id("username")).sendKeys("UHI58");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("(//input[@id='loginusertype'])[2]")).click();
	driver.findElement(By.id("password")).sendKeys("Umesh@1234");
	driver.findElement(By.id("securitykey")).sendKeys("22146");
	WebElement element = driver.findElement(By.id("loginredirect"));
	Thread.sleep(3000);
	Select s=new Select(element);
	s.selectByIndex(2);
	Thread.sleep(2000);
	driver.close();
	
}

}
