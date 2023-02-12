package Selenium;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct11_multiWindow_handling {

	public static void main(String[] args) {
		String path="C:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=null;
		try {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("https://www.incometaxindiaefiling.gov.in/home");
			
			// get handle of main window			
			String main_window=driver.getWindowHandle();
			System.out.println("Main Window "+driver.getTitle());
			Set<String> child= driver.getWindowHandles();
			System.out.println("Total child window: "+child.size());
			for (String wind : child) {
				//if(!wind.equalsIgnoreCase(main_window)) 
				{
					driver.switchTo().window(wind);
					driver.manage().window().maximize();
					System.out.println("Current Window Title: ");
					driver.close();					
				}
			}
			
			driver.switchTo().window(main_window);
		}catch (Exception e) {
			System.out.println("Error**** "+e);
		}finally {
			driver.close();
		}	

	}

}
