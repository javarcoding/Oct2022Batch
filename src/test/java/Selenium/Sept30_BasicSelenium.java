package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sept30_BasicSelenium {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.google.com/");
      System.out.println("Title is" +driver.getTitle());
      System.out.println("Current Url "+driver.getCurrentUrl());
      driver.close();

	}

}
