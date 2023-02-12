package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct4 {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.google.com/");
	      

	}

}
