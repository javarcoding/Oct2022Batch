package Selenium;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.compressors.FileNameUtil;
import org.apache.commons.io.FileUtils;
import org.apache.poi.examples.util.TempFileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	public static void main(String[] args) {
		// System.getProperty("user.dir")+"\\"
		String path="C:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=null;
		try {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			TakesScreenshot screen=(TakesScreenshot) driver;
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Hello");
			Thread.sleep(1000);
			File SourceFile=screen.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(SourceFile, new File(System.getProperty("user.dir")+"\\s1.png"));
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			driver.close();
		}

	}

}
