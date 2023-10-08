package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.facebook.com/");
  Thread.sleep(5000);
  driver.findElement(By.id("email")).sendKeys("vaibhav");
  Thread.sleep(5000);
  driver.findElement(By.id("pass")).sendKeys("Pass@1234");
  Thread.sleep(5000);
  driver.findElement(By.name("login")).click();
  Thread.sleep(1500);
  driver.close();
  
}
}
