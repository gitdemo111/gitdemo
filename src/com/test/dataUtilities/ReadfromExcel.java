package com.test.dataUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadfromExcel {
	
	static String value = null;
	
	@Test
	public static String readexceldata(String tcid, String colname) throws FileNotFoundException {
		
		
		FileInputStream fi = new FileInputStream("D:\\Mathimist\\Selenium_Projects\\TestNG_learning\\Demo.xlsx");
		
		try {
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			
			XSSFSheet ws = wb.getSheetAt(0);
			
			
			System.out.println("number of sheets "+wb.getNumberOfSheets());
			
			System.out.println("number of rows "+ws.getPhysicalNumberOfRows());
			
			System.out.println("lastt number of rows "+ws.getLastRowNum());
			
			
			Iterator<Row> rowI =  ws.iterator();
			
			Row firstrow = rowI.next();
			
			int colnumber = 0;
			Iterator<Cell> cellI = firstrow.cellIterator();
			
			// Finding column number using the firstrow
			
			while (cellI.hasNext())
			{
				
				Cell cell = cellI.next();
				
				
				if (cell.getStringCellValue().equals(colname))					
				{
					System.out.println("column number is "+colnumber);
					break;
				}
				
				
				colnumber++;
				
			}
			
			
			// Find rownumber by iterating RowI
			
			int rownum = 1;
			
			
			while (rowI.hasNext())
			{
				
				Row row = rowI.next();
				
				
				if (row.getCell(0).getStringCellValue().equals(tcid))
				{
					
					System.out.println("row number is "+rownum);
					break;
					
				}
				
				rownum++;
				
			}
			
						
			System.out.println(ws.getRow(rownum).getCell(colnumber).getStringCellValue());
			
			value= ws.getRow(rownum).getCell(colnumber).getStringCellValue();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return value;
	}
	
	

}
