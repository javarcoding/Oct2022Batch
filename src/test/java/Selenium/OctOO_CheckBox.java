package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OctOO_CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Chromedriver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	      driver.get("http://demo.guru99.com/test/radio.html");
	      driver.findElement(By.xpath("//input[@name='webform'and @value=\"checkbox1\"]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@name='webform'and @value=\"checkbox2\"]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@name='webform'and @value=\"checkbox3\"]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@name='webform'and @value=\"checkbox2\"]")).click();
           driver.close();
	}

}
