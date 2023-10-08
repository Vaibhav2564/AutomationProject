package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeAutomation {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("automation test");
	driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
}
}
