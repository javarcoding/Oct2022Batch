package myTestNG;

import org.testng.annotations.Test;

public class Oct19_crossBrowser {
	//WebDrivier driver=null

	//@BeforeClass
	//@Parameter("btype")

	public void bclass(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
		//	System.setProperty("webdriver.chrome.driver", C:\\Chromedriver\\chromedriver.exe);
			//driver=new ChromeDriver();
		}
	}
}
