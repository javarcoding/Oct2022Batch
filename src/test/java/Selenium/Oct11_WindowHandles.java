package Selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct11_WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.naukri.com/");
	      //I will took current/parent web page  handle
	      String parentHandle=driver.getWindowHandle();
	      System.out.println("Parent:"+parentHandle);
	      Set<String> allHandle= driver.getWindowHandles();
	      System.out.println("All******");
	      for(String curr:allHandle) {
	    	  System.out.println(curr);
	    	  
	    	  if(parentHandle!=curr)
	    		  driver.switchTo().window(curr);
	    	      driver.manage().window().maximize();
	    	      Thread.sleep(3000);
	    	      driver.close();
	    	      
	      }
	}
}
