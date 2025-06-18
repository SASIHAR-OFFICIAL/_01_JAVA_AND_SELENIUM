package _S_05_28_DataDriven_Apache_POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _04_DataDriven_Using_Apache_POI_Using_For_loop {

	public static void main(String[] args) throws IOException {
		//FileInputStream fis = new FileInputStream("C:\\WebDriver\\TESTING FILES\\ALL IN ONE UPDATED.xlsx");
		FileInputStream fis = new FileInputStream("C:\\WebDriver\\TESTING FILES\\1 to 100.xlsx");
		XSSFWorkbook XW = new XSSFWorkbook(fis);
		XSSFSheet XSheet = XW.getSheetAt(0);
		int lastRowNum = XSheet.getLastRowNum();
		short lastCellNum = XSheet.getRow(1).getLastCellNum();
		
		for (int i = 0; i < lastRowNum+1; i++) {
			XSSFRow row = XSheet.getRow(i);
			XSSFCell cell;
			for (int j = 0; j < lastCellNum; j++) {
				cell = row.getCell(j);
				DataFormatter dF = new DataFormatter();
				String formatCellValue = dF.formatCellValue(cell);
				System.out.println(formatCellValue);
			} 
		}
			
	}
}
