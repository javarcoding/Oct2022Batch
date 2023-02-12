package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Oct00_PropertiesWithOptionButton {

	public static void main(String[] args) throws IOException, InterruptedException {
		Properties p=new Properties();
		WebDriver driver=null;
		String CurProjPath=System.getProperty("user.dir");
		String fname="\\OctBatch.properties";
		//path=dirpath\\filename
		FileInputStream fin=new FileInputStream(CurProjPath+fname);
		p.load(fin);
		
		//System.out.println("driverPath is"+p.getProperty("driverPath"));
		System.setProperty(p.getProperty("driverName"), p.getProperty("driverPath"));
		if(p.getProperty("browser").equals("chrome")) {
		      driver=new ChromeDriver();
		      
		}
		else {
			 driver=new FirefoxDriver();
		}
            driver.get(p.getProperty("url")); 
            //driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys(p.getProperty("search"));
            //driver.findElement(By.xpath("//*[@name=\"q\"]")).submit();
		    WebElement ele=driver.findElement(By.xpath("//input[@name='webform'and @value=\"Option 2\"]"));
		    if(ele.isDisplayed())
		    	System.out.println("It is Displayed");
		    if(ele.isEnabled())
		    	System.out.println("It is Enabled");
		    if(ele.isSelected())
		    	System.out.println("It is Selected");
		    else
		    	System.out.println("Not Selected Yet");
		    ele.click();
		    if(ele.isSelected())
		    	System.out.println("It is selected");
		    else
		    	System.out.println("Not Selected Yet");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//input[@name='webform'and @value=\"Option 1\"]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@name='webform'and @value=\"Option 3\"]")).click();
		    
		    driver.close();
	}

}
