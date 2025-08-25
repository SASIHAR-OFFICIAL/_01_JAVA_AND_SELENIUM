package _S_05_26_1_Get_Excel_Data_Using_JXL_LAO;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class _04_OwnTest_04 {

	public static void main(String[] args) throws BiffException, IOException {
		
		FileInputStream FIS4 = new FileInputStream("C:\\WebDriver\\TESTING FILES\\XLS FILES.xls");
		Workbook WB_Obj4 = Workbook.getWorkbook(FIS4);
		Sheet sheet = WB_Obj4.getSheet("SEARCH");
		int rows = sheet.getRows();
		int columns = sheet.getColumns();
		
		String contents;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				contents = sheet.getCell(j, i).getContents();
				System.out.println("contents ="+contents);
			} 
		}
		
	}

}
