package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyindexing {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("t shirt for men");
	driver.findElement(By.xpath("//a[@data-reactid='908']")).click();
	driver.findElement(By.xpath("(//label[@class='vertical-filters-label common-customCheckbox'])[3]")).click();
	driver.findElement(By.xpath("(//h3[text()='HRX by Hrithik Roshan'])[2]")).click();
	Thread.sleep(5000);
	driver.quit();
	
	
	
	
	
}





}
