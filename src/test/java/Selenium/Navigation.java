package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.amazon.com/");
	     //driver.get("https://www.snapdeal.com/");
	      driver.navigate().to("https://www.snapdeal.com");
	      driver.navigate().back();
	      driver.navigate().forward();
	      driver.navigate().refresh();
		

	}

}
