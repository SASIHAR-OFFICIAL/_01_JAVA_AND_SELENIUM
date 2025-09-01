package _S_05_26_2_Excel_Data_to_Web_Using_JXL_LAO_Own;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class _04_OwnTest {

	public static void main(String[] args) throws BiffException, IOException {
		FileInputStream fis4 = new FileInputStream("C:\\WebDriver\\TESTING FILES\\XLS FILES.xls");
		Workbook WB_Obj4 = Workbook.getWorkbook(fis4);
		Sheet sheet = WB_Obj4.getSheet("SEARCH1");
		int rows = sheet.getRows();
		int columns = sheet.getColumns();
		String contents;
				for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				contents = sheet.getCell(j, i).getContents();
				System.out.println(contents);
			} 
		}
		
	}
}
