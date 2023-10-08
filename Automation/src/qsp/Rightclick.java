package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/login.do");
	WebElement element = driver.findElement(By.linkText("actiTIME Inc."));
	Thread.sleep(2000);
	Actions a=new Actions(driver);
	a.contextClick(element).perform();
	Robot r=new Robot();
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_T);
	Thread.sleep(6000);
	driver.quit();
}
}
