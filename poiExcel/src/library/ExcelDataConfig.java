package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	//Create a Constructor
	
	public ExcelDataConfig(String excelPath){
		File src = new File(excelPath);
		FileInputStream fil;
		try {
			fil = new FileInputStream(src);
			wb = new XSSFWorkbook(fil);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
		}
	}
	
	public String getData(int sheetNumber, int rowNumber, int colNumber){
		sheet1 = wb.getSheetAt(sheetNumber);
		String data = sheet1.getRow(rowNumber).getCell(colNumber).getStringCellValue();
		
		return data;
		
	}
	
	
}
	

