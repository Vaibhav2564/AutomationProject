package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathfortable {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Types of Work")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='manufacturing']/../../td[4]")).click();
	Thread.sleep(4000);
	driver.close();
	
	
	
}







}
