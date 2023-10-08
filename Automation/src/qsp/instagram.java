package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys("vaibhav");
	Thread.sleep(5000);	
	driver.findElement(By.name("password")).sendKeys("passs");
	Thread.sleep(5000);
	driver.close();
}
}
