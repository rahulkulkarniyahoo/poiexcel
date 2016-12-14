package readexceldata;

import library.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {
		
		ExcelDataConfig edc = new ExcelDataConfig("UserData.xlsx");
			
		System.out.println(edc.getData(1, 0, 1));
	}

}
