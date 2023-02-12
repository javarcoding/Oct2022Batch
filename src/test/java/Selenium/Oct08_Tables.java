package Selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct08_Tables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> l1=driver.findElements(By.xpath("//table[@id=\\\"customers\\\"]/tbody/tr"));
		int totalrow=l1.size();
		List<WebElement> l2=driver.findElements(By.xpath("//table[@id=\\\"customers\\\"]/tbody/tr[1]/td"));
		int totalcol=l2.size();
		for (int j=1;j<=totalcol;j++) {
			System.out.print("\t"+driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th")).getText());
			System.out.println();
			for (int i=2;i<=totalrow;i++) {
			WebElement e1=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println("\t"+e1.getText());
			}
			System.out.println();
			driver.close();
		}
	}

}
