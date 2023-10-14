package AutomationTesting.SeleniumTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.ReadPropertyFile;

public class DataProvidersExample extends BaseClass {

//	WebDriver driver;
//	String url;
//	@BeforeClass
//	public void intailization() throws IOException, InterruptedException {
//		driver = InitailizeBrowser();
//		ReadPropertyFile rp= new ReadPropertyFile();
//		 url=rp.getDataFromProperty("URL");
//		 driver.get(url);
//	}
	DataFormatter formatter = new DataFormatter();
	@Test(dataProvider = "data")
	public void TestRun(String greetings,String username,String password) throws IOException, InterruptedException {
		System.out.println(greetings+" "+username+" "+password);
	}
	
	@DataProvider(name = "data")
	public Object[][] getTestData() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\anwreddy\\ExcelData\\FacebookLogin.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("FacebookLogin");
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		Object[][] data = new Object[rowCount-1][colCount];
		for(int i=0;i<rowCount-1;i++) {
			row = sheet.getRow(i+1);
			for(int j=0;j<colCount;j++) {
				XSSFCell cell = row.getCell(j);
				data[i][j] = formatter.formatCellValue(cell);
			}
		}
		
		return data;
		
	}
	@DataProvider(name = "date")
	public Object[][] getTestDate() {
		Object[][] data = {{"hey","hi","ul"},{"Hyy","dhs","dasa"}};
		return data;
	}
	
}
