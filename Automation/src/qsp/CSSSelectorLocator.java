package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorLocator {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
Thread.sleep(5000);
driver.findElement(By.name("username")).sendKeys("VaibhavC097");
driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys("pass@123");
driver.findElement(By.cssSelector("button[class='_acan _acap _acas _aj1-']")).click();
Thread.sleep(5000);
driver.close();

}
}