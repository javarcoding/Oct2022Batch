package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct11_Alert {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();      //or alt.dismiss();
	
		driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
		Thread.sleep(7000);
		driver.switchTo().alert();
		alt.accept();
		
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		//for confirmation accept and dismiss do not have same value
		Thread.sleep(2000);
		driver.switchTo().alert();
		alt.accept();
		
		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		alt=driver.switchTo().alert();
		alt.sendKeys("ADSUL");  //send the data to text box
		alt.accept();
		Thread.sleep(2000);
		driver.close();
	}
}
