package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///C:/Users/hp/Desktop/Demo.html");
	Thread.sleep(5000);
	driver.findElement(By.id("Mumbai")).click();  //locate the element from webelement
	Thread.sleep(5000);
	driver.navigate().back();
	driver.findElement(By.id("Banglore")).click();
	Thread.sleep(5000);
	driver.close();
}
}
