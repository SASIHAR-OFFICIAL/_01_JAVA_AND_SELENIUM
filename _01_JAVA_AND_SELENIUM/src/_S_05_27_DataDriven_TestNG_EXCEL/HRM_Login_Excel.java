package _S_05_27_DataDriven_TestNG_EXCEL;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class HRM_Login_Excel {

	public void Get_Excel_Data() throws BiffException, IOException {
		FileInputStream FileInputStream_Obj = new FileInputStream("C:\\WebDriver\\HRM Login.xls");
		Workbook Workbook_obj = Workbook.getWorkbook(FileInputStream_Obj);
		Sheet Sheet_Obj = Workbook_obj.getSheet(0);
		int rows = Sheet_Obj.getRows();
		int columns = Sheet_Obj.getColumns();
		
	
}}
