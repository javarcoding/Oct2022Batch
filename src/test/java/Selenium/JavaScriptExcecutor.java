package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExcecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.location='https://www.google.com/'");
		js.executeScript("window.location=arguments[0]", "https://www.google.com/");
		System.out.println("Title"+js.executeScript("return document.title;").toString());
		System.out.println("URL"+js.executeScript("return document.URL;").toString());
		System.out.println("Domain"+js.executeScript("return document.domain;").toString());
		js.executeScript("arguments[0].value=arguments[1]", driver.findElement(By.xpath("//*[@name=\"q\"]")),"INDIA");
		js.executeScript("alert('My JS alert');");
		Thread.sleep(3000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@name='q']//following::input[3]")));
		//js.executeScript("window.scrollBy(0,600)");
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h3[contains(text(),\"Department of Post\")]")));
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}
