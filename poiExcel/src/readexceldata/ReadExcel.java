package readexceldata;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		File src = new File("UserData.xlsx");
		FileInputStream fil = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fil);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from Excel = " + data0);
		
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from Excel = " + data1);
		
		int rowCount = sheet1.getLastRowNum();
		System.out.println("total Number of Rows = " + rowCount++);
		
		for (int i =0; i<rowCount;i++){
			data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("test Data from excel is " + data0);
		}
		
		wb.close();
	}

}
