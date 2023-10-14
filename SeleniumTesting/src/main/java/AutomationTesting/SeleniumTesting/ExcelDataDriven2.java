package AutomationTesting.SeleniumTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.ReadPropertyFile;

public class ExcelDataDriven2 extends BaseClass{

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
		public ArrayList<Hashtable<String,String>> Run(String Excelpath,String sheetName,String ColumnName,String testCaseName) throws IOException, InterruptedException {
			
			
							
			
			FileInputStream fis = new FileInputStream(Excelpath);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			ArrayList<Hashtable<String,String>> al = new ArrayList<Hashtable<String,String>>();
			Hashtable<String,String> hash = new Hashtable<String,String>(); 
			
			//for(int i=0;i<workbook.getNumberOfSheets();i++) {
			//	if(workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
				
				//	XSSFSheet sheet = workbook.getSheetAt(i);  
			XSSFSheet sheet = workbook.getSheet(sheetName);
					Iterator<Row> rows = sheet.iterator();  // sheet is a collection of rows
					ArrayList<String> data1 =new ArrayList<String>() ;	
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
					switch (((Cell) cell).getCellType()) {
					case Cell.CELL_TYPE_STRING:
					data1.add(cell.getStringCellValue());
					
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
						hash.put(String.valueOf(data1.add(c)),c.getStringCellValue());
						al.add(hash);
						break;

					default:
						hash.put(String.valueOf(data1.add(c)),Integer.toString((int)(c.getNumericCellValue())));
						al.add(hash);
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

