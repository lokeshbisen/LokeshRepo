package javaPackage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel1 {

	public static void main(String[] args) throws Exception {
		// Specify the location of excel file
		File src = new File("C:\\Users\\ADMIN\\Desktop\\Short Notes.xlsx");
		
		//Load the File
		FileInputStream fis = new FileInputStream(src);
		
		//Load Workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//Load WorkSheet
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		//Print the loaded sheet name
		System.out.println(sh.getSheetName());
		
		//Print operators from Excel sheet
		System.out.println(sh.getRow(5).getCell(1).getStringCellValue());
		
		
		

	}

}
