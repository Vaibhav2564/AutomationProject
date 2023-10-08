package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselectlistbox {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Vaibhav");
	driver.findElement(By.name("lastname")).sendKeys("Chavan");
	driver.findElement(By.name("reg_email__")).sendKeys("8097874526");
	driver.findElement(By.id("password_step_input")).sendKeys("Vaibhav@1234");
	driver.findElement(By.xpath("//label[text()='Male']")).click();
	WebElement element = driver.findElement(By.id("month"));
	Select s=new Select(element);
	Thread.sleep(4000);
	s.selectByIndex(3);
	//s.selectByVisibleText("May");
	Thread.sleep(5000);
	
	WebElement element1 = driver.findElement(By.id("day"));
	Select s1=new Select(element1);
	Thread.sleep(3000);
	s1.selectByValue("17");
	
	WebElement element2 = driver.findElement(By.id("year"));
	Select s2=new Select(element2);
	Thread.sleep(4000);
	s2.selectByVisibleText("2009");
	Thread.sleep(2000);
	
	driver.close();
	
	
	
	
	
}






}
