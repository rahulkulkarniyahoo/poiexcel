package readexceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelSheet {

	public static void main(String[] args) throws Exception {
		
		File src = new File("UserData.xlsx");
		FileInputStream fil = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fil);
		XSSFSheet sheet1 = wb.getSheetAt(0);
	
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		sheet1.getRow(1).createCell(2).setCellValue("Fail");
		
		FileOutputStream fOut = new FileOutputStream(src);
		
		wb.write(fOut);
		wb.close();
	}

}
