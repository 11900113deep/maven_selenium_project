package Data_driven_testing_package;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class reading_excel_data {
	public static void main(String args[]) throws Exception
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\test_dataset\\data_set1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1"); //workbook.getSheetAt(0) pass the index in this method
		
		//read data from excel 
		int totalrows = sheet.getLastRowNum(); //get total rows
		int totalcells = sheet.getRow(1).getLastCellNum();	// get total cells 	
		System.out.println("number of rows: "+totalrows);
		System.out.println("number of cells: "+totalcells);
		
		//reading data
		
		for(int r=0;r<=totalrows;r++)
		{
			XSSFRow CurrentRow = sheet.getRow(r);
			for(int c=0;c<totalcells;c++)
			{
				//two methods
				//1st method
				//XSSFcell cell = currentRow.getCell(c);
				//String value = cell.toString();
				
				//2nd method
				String value = CurrentRow.getCell(c).toString();
				System.out.print(value+" ");
				
			}
			System.out.println();
			
		}
		workbook.close();
		file.close();
	
	}

}
