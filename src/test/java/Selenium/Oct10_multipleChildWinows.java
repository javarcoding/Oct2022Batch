package Selenium;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct10_multipleChildWinows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");


		// Opening all the child window
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();

		//store parent window handle (ID)
		String MainWindow = driver.getWindowHandle();
		System.out.println("Main window handle is " + MainWindow);

		// To get handle (ID) of all new opened window
		Set<String> s1 = driver.getWindowHandles();
		System.out.println("Child window handle is" + s1);
		Iterator<String> i1 = s1.iterator();

		// Here we will check if child window has other child windows and when child window
		//is the main window it will come out of loop.
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!MainWindow.equals(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				//System.out.println(driver.getPageSource()+"**********************");
				Thread.sleep(2000);
				driver.close();
				System.out.println("Child window closed");
			}
		}
		Thread.sleep(2000);
		driver.switchTo().window(MainWindow);
		System.out.println("Main Window is closed");
		driver.close();
	}

	
}
