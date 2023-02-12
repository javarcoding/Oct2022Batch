package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dependencies {
 WebDriver driver=null;
 
 @Test
 void OpenBrowser() 
 {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
 }
 
 @Test(dependsOnMethods = {"OpenBrowser"})
 public void findElement()
 {
	 driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Selemium");
	 driver.findElement(By.xpath("//*[@name=\"q\"]")).submit();
 }
 
 @Test(dependsOnMethods = {"OpenBrowser", "findElement"})
 public void displayResult()
 {
	 String res=driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText();
	 System.out.println(res);
 }
}
