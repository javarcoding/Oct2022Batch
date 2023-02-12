package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
	//String path="C:\\Chromedriver\\chromedriver.exe";
	//System.setProperty("webdriver.chrome.driver", path);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.google.com");
	
	driver.close();
	}

}
