package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.drive", "./driver/chrome.exe");//set path browser path
	ChromeDriver driver=new ChromeDriver();    //lauch browser
	driver.manage().window().maximize();   //maximize the browser window
	driver.get("https://www.instagram.com/accounts/emailsignup/");  //navigate page
	String title = driver.getTitle();   //get title of url
	
	System.out.println(title);
	Thread.sleep(5000);  //wait for 5 sec
	driver.close();
	
}
}
