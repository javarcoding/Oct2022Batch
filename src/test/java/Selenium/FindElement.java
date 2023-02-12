package Selenium;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        //driver.findElement(By.xpath("//a[text()=\"English (UK)\"]")).click();
        //driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("xyz");
        //WebElement ele=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]//a"));
        // System.out.println(ele.getText());
         //driver.findElement(By.xpath("//a[text()=\"English (UK)\"]")).click();
        // driver.navigate().to("https://www.amazon.com");
	}

}
