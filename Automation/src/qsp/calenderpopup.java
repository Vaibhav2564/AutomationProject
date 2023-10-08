package qsp;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class calenderpopup {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
	driver.findElement(By.id("policynumber")).sendKeys("123");
	driver.findElement(By.id("dob")).click();
	Thread.sleep(2000);
	WebElement month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
	Select s=new Select(month);
	Thread.sleep(2000);
	s.selectByVisibleText("Dec");
	WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select s1=new Select(year);
	Thread.sleep(2000);
	s1.selectByValue("2000");
	driver.findElement(By.linkText("4")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("alternative_number")).sendKeys("8098567895");
	Thread.sleep(5000);
	driver.close();
}
}
