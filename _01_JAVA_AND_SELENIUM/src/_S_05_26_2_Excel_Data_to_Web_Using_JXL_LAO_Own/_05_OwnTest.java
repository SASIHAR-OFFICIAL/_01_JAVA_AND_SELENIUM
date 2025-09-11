package _S_05_26_2_Excel_Data_to_Web_Using_JXL_LAO_Own;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class _05_OwnTest {

	@SuppressWarnings("null")
	public static void main(String[] args) throws BiffException, IOException {

FileInputStream fis5 = new FileInputStream("C:\\WebDriver\\TESTING FILES\\XLS FILES.xls");
	Workbook Wb5 = Workbook.getWorkbook(fis5);
	Sheet sheet = Wb5.getSheet(6);
	int rows = sheet.getRows();
	int columns = sheet.getColumns();
	
	System.out.println("rows = "+rows);
	System.out.println("columns ="+columns);
	
	String[][] contents = new String[rows][columns];
	
	
	for (int i = 0; i < rows; i++) {
		
		for (int j = 0; j < columns; j++) {
			contents[i][j]= sheet.getCell(j, i).getContents();
			System.out.println(contents[i][j]);
				} 
	}
	
	}

	}


