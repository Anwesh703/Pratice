package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import AutomationTesting.SeleniumTesting.BaseClass;

public class ExcelDataDriven extends BaseClass{

		WebDriver driver;
		String url;
	//	@BeforeClass
		public void intailization() throws IOException, InterruptedException {
			driver = InitailizeBrowser();
			

			ReadPropertyFile rp= new ReadPropertyFile();
			 url=rp.getDataFromProperty("URL");
			 driver.get(url);
		}
		@Test
		public ArrayList<String> Run(String Excelpath,String sheetName,String ColumnName,String testCaseName) throws IOException, InterruptedException {
			
			
							
			
			FileInputStream fis = new FileInputStream(Excelpath);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			ArrayList<String> al = new ArrayList<String>();
			//for(int i=0;i<workbook.getNumberOfSheets();i++) {
			//	if(workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
				
				//	XSSFSheet sheet = workbook.getSheetAt(i);  
			XSSFSheet sheet = workbook.getSheet(sheetName);
					Iterator<Row> rows = sheet.iterator();  // sheet is a collection of rows
					
					//
			
			

				if(rows.hasNext()) {
					ArrayList<String> row = new ArrayList<String>();
				
					Row firstRow = rows.next();
					Iterator<Cell> cell= firstRow.cellIterator(); //rows is a collection of cells(or)coulmns
					int m = 0;
					//int i = 0;
					//int numOfHeaders = 0;
					int coloumn = 0;
					while(cell.hasNext()) {
					Cell data = cell.next();

				
					
					if(data.getStringCellValue().equalsIgnoreCase(ColumnName)) {
						coloumn = m;
					}
					m++;
					}
					while(rows.hasNext()) {
					Row	r = rows.next();
					if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testCaseName)) {
						Iterator<Cell> cv= r.cellIterator(); 
						while(cv.hasNext()) {
			           Cell c = cv.next();
			           switch (c.getCellType()) {
					case STRING:
						al.add(c.getStringCellValue());
						break;

					default:
						al.add(Integer.toString((int)(c.getNumericCellValue())));
						break;
					}
//							if(c.getCellType()==CellType.STRING) {
//						al.add(c.getStringCellValue());
//							}
//							else {
//								al.add(Integer.toString((int)(c.getNumericCellValue())));
//							}
						}
						
						}
					}
					}
					
				//}
				
			//}
		return al;	
		}
		
		}

