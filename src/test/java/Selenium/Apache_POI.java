package Selenium;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Apache_POI {
 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		XSSFWorkbook wb=null;
		try {
			FileInputStream fin=new FileInputStream("E:\\Sample1.xlsx");
			wb=new XSSFWorkbook(fin);
			XSSFSheet sheet=wb.getSheet("login");
			int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
			System.out.println(" Row Count "+rowcount);
			XSSFCell Cel1,Cel2;
			Row row;
			Cell col;
			for(int i=1;i<=rowcount;i++) {
				row=sheet.getRow(i);
				Cel1=sheet.getRow(i).getCell(0);
				Cel2=sheet.getRow(i).getCell(1);
				String val1=Cel1.getStringCellValue();
				String val2=Cel2.getStringCellValue();
				System.out.println("User Name "+val1+"\t  Password "+val2);
				driver.get("https://www.facebook.com");
				driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(val1);
				driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(val2);
				Thread.sleep(3500);
				driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
				col=row.createCell(2);
				row.createCell(2).setCellValue("invalid");
			}
			fin.close();
			FileOutputStream fout=new FileOutputStream("E:\\Sample1.xlsx");
			wb.write(fout);
			fout.close();
			wb.close();
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			
			driver.close();
		}

	}
}
