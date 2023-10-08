package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethod {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.navigate().to("https://www.guitarcenter.com/");
	Thread.sleep(8000);
	driver.navigate().back();
	Thread.sleep(8000);
	driver.navigate().forward();
	Thread.sleep(8000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.close();
	
}
}
