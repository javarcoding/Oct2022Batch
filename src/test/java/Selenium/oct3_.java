package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class oct3_ {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      driver.findElement(By.xpath(" //a[text()=\"English (UK)\"]")).click();
	      driver.findElement(By.cssSelector("input#email")).sendKeys("ravirajadsul9297");
	      driver.findElement(By.cssSelector("input#pass")).sendKeys("12345");
	      driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();
;
	}

}
