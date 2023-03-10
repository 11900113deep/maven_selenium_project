package Data_driven_testing_package;

import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writing_intoexcel_file {
	public static void main(String args[]) throws Exception
	{
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\test_dataset\\data_set2.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		
		//create rows,cells and update data without loop
		
		//create using loop
		Scanner sc = new Scanner(System.in);
		for(int r=0;r<=3;r++) {
			XSSFRow currentrow = sheet.createRow(r);
			for(int c=0;c<2;c++)
			{
				System.out.println("Enter a value: ");
				String values = sc.next();
				currentrow.createCell(c).setCellValue(values);
				
			}
			
		}
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("Writing is done....");
		

}
}
