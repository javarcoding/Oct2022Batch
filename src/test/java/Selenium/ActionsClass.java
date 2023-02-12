package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      driver.findElement(By.xpath(" //*[text()=\"English (UK)\"]")).click();
	      driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
	     //create new account
	      driver.findElement(By.xpath("//*[@data-testid=\"open-registration-form-button\"]")).click();
	      
	      WebElement ele=driver.findElement(By.xpath("//*[@name=\"firstname\"]"));
	      Actions act=new Actions(driver);
	      //suppose i want data to be in upper case we use either shift / CapsLock
	      act.keyDown(ele, Keys.SHIFT).sendKeys("newAccountName").keyUp(Keys.SHIFT).build().perform();
	      
	      //lets copy this and put in second name
	      //to copy we use control + A + C
	      act.keyDown(Keys.CONTROL).sendKeys("A").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	      //shift  to second name textbox using tab
	      act.sendKeys(Keys.TAB);
	      //now to paste we use Control + V
	      act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
	      
	      act.sendKeys(Keys.TAB).build().perform();
	      act.sendKeys("9359575558").perform();
	      act.sendKeys(Keys.TAB).build().perform();
	      act.sendKeys("PassWord123").build().perform();
	      driver.close();
	      
	     

	}

}
