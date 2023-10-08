package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement element = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	Actions a=new Actions(driver);
	a.doubleClick(element).perform();
	Alert a1 = driver.switchTo().alert();
	Thread.sleep(5000);
	String text = a1.getText();
	System.out.println(text);
	a1.accept();
	Thread.sleep(5000);
	driver.close();

}

}
