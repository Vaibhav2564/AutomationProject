package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "./drivchromedriver.exe");
	 ChromeDriver driver= new ChromeDriver();
	 driver.get("https://www.youtube.com/");
	 Thread.sleep(5000);
	 driver.close();
	}
}
