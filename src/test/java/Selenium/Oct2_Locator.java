package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Oct2_Locator {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      driver.findElement(By.xpath(" //a[text()=\"English (UK)\"]")).click();
	      List<WebElement> ele=driver.findElements(By.tagName("input"));
	      for (WebElement xyz : ele) {
			System.out.println(xyz.getAttribute("Name"));
		}
	      driver.findElement(By.linkText("Create a page")).click();
         driver.close();
	}

}
