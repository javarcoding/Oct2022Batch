package Selenium;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_in_Selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=null;
		try {
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.edureka.co/");
			/*
			//Explicit wait
			WebDriverWait mywait=new WebDriverWait(driver, 30);
			WebElement ele;
			ele=mywait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@class=\"form-control popusrphn new-duq-mobile-in\"]"))));
			ele.sendKeys("985632515");
			*/
			
			//fluent wait
			FluentWait wait=new FluentWait(driver);
			wait.withTimeout(50,TimeUnit.SECONDS);
			wait.pollingEvery(5,TimeUnit.SECONDS);
			wait.ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@class=\"form-control popusrphn new-duq-mobile-in\"]"))));
			driver.findElement(By.xpath("//input[@class=\"form-control popusrphn new-duq-mobile-in\"]")).sendKeys("985632515");
			Thread.sleep(3000);			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//driver.close();

	    }
	}	
}
