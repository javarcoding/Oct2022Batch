package Selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oct12_POI {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.google.com/");
		FileInputStream fin=new FileInputStream("E:\\Sample1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		XSSFSheet mysheet=wb.getSheet("google_search");
		
		int rowNo=mysheet.getLastRowNum()-mysheet.getFirstRowNum()+1;
		System.out.println("In this sheet we have"+rowNo+"rows");
		//now we know how many rows
		for (int i=0;i<rowNo;i++) {
			XSSFRow r=mysheet.getRow(i);
			XSSFCell myvalue=mysheet.getRow(i).getCell(0);
			System.out.println(myvalue.getStringCellValue());
			driver.findElement(By.xpath("//*[@name=\"q\" and @type=\"text\"]")).clear();
			driver.findElement(By.xpath("//*[@name=\"q\" and @type=\"text\"]")).sendKeys(myvalue.getStringCellValue());
			driver.findElement(By.xpath("//*[@name=\"q\" and @type=\"text\"]")).submit();
			Thread.sleep(3000);
			String result=driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText();
			r.createCell(1).setCellValue(result);
			
		}
		fin.close();
		FileOutputStream fout=new FileOutputStream("E:\\Sample1.xlsx");
		wb.write(fout);
		fout.close();
		wb.close();
		driver.close();

	}

}
