package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Oct8_table {

	public static void main(String[] args) {
		
		String url="https://www.facebook.com/";
		String path="F:\\chromedriver\\chromedriver.exe";
		WebDriver driver=null;
		try {
			System.setProperty("webdriver.chrome.driver", path);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
			driver.get(url);
			
			//click on create new account
			driver.findElement(By.xpath("//*[@name=\"login\"]//following::a[2]")).click();
			
			//put data
			driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("hello");
			driver.findElement(By.xpath("//*[@name=\"lastname\"]")).sendKeys("Fine");
			driver.findElement(By.xpath("//*[@name=\"reg_email__\"]")).sendKeys("6987456321");
			driver.findElement(By.xpath("//*[@name=\"reg_passwd__\"]")).sendKeys("!@abcde123");
			Select BDay=new Select(driver.findElement(By.xpath("//*[@name=\"birthday_day\"]")));
			BDay.selectByIndex(05);
			Select mon=new Select(driver.findElement(By.xpath("//*[@name=\"birthday_month\"]")));
			mon.selectByIndex(10);
			Select year=new Select(driver.findElement(By.xpath("//*[@name=\"birthday_year\"]")));
			year.selectByIndex(15);
			driver.findElement(By.xpath("//*[@name=\"websubmit\"]//preceding::label[2]")).click();
			driver.findElement(By.xpath("/*[@name=\"websubmit\"]"));
			Thread.sleep(2000);
			
			
			
			
			
			Thread.sleep(2000);
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			driver.close();
		}

	}

}
