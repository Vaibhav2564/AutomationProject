package qsp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertPopup {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	driver.findElement(By.xpath("//div[text()='Tasks']")).click();
	driver.findElement(By.xpath("//div[text()='Add New']")).click();
	driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
	driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("abc");
	driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
	Alert a = driver.switchTo().alert();
	Thread.sleep(3000);
	String poptext = a.getText();
	System.out.println(poptext);
	a.dismiss();
	//a.accept();
	driver.close();
	
}
}