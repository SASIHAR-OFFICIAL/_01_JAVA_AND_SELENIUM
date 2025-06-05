package _S_05_27_DataDriven_JXL_TestNG_EXCEL;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class _05_BRM_tremplintech {

	public static void main(String[] args) throws BiffException, IOException {

		FileInputStream FIS_obj = new FileInputStream("C:\\WebDriver\\TESTING FILES\\BRM Login.xls");
		Workbook WB_ObjWorkbook = Workbook.getWorkbook(FIS_obj);
		Sheet sheet_ObjSheet = WB_ObjWorkbook.getSheet(0);
		
		
	}

}
