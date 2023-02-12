package Selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POI2 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
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
				
				
			}
			fin.close();
			FileOutputStream fout=new FileOutputStream("E:\\Sample1.xlsx");
			wb.write(fout);
			fout.close();
			wb.close();
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			
			//driver.close();
		}


	}

}
