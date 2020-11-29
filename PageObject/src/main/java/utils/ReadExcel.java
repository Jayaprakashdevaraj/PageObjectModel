package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String filename) throws IOException {

		// to get into the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./Data/"+filename+".xlsx");

		// to get into worksheet
		XSSFSheet sheet = wb.getSheet("Sheet1"); // Or by using index wb.getSheetAt(0);

		// To get no of rows
		int rowCount = sheet.getLastRowNum(); // getlastrow num is not count first ro0w
		
		int cellCount = sheet.getRow(0).getLastCellNum();
		
		// declare 2D array for connect excel to test case
		String[][] data = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {

				// to get into the row
				XSSFRow row = sheet.getRow(i);

				// To get into the cell
				XSSFCell cell = row.getCell(j);

				// to get cell value
				String cellValue = cell.getStringCellValue();
				
				//  or using this  String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				
				System.out.println(cellValue);
				
				data[i-1][j] = cellValue;

			}

		}

		wb.close();
		return data;
	}
}