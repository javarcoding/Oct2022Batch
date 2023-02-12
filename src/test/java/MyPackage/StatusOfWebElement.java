package MyPackage;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebElement {

	public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.amazone.com");
           
            //driver.close();


	}

}
