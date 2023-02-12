package Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Oct07Properties {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		WebDriver driver=null;
		String CurProjPath=System.getProperty("user.dir");
		String fname="OctBatch";
		//path=dirpath\\filename
		FileInputStream fin=new FileInputStream(CurProjPath+fname);
		p.load(fin);
		
		System.setProperty(p.getProperty("driverName"), p.getProperty("driverPath"));
		if(p.getProperty("browser").equals("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
         driver.get(p.getProperty("url"));
	}

}
