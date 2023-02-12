package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Oct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      driver.findElement(By.xpath(" //a[text()=\"English (UK)\"]")).click();
	      driver.findElement(By.xpath("//*[text()=\"Create New Account\"]")).click();
	      Select sel=new Select(driver.findElement(By.xpath("//select[@name=\"birthday_day\"]")));
	      sel.selectByValue("15");
	    
	      
	      
	      
	}

}
