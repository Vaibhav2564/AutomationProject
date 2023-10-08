package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.bbc.com/");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		int y = driver.findElement(By.xpath("//span[text()='Editor’s Picks']")).getLocation().getY();
		System.out.println(y);
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,"+y+")");
		Thread.sleep(5000);
		driver.close();
	}
}
