package _S_05_26_2_Excel_Data_to_Web_Using_JXL_LAO_Own;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class _03_OwnTest {

	public static void main(String[] args) throws BiffException, IOException {
		FileInputStream FIS3 = new FileInputStream("C:\\WebDriver\\TESTING FILES\\XLS FILES.xls");
		Workbook WB3 = Workbook.getWorkbook(FIS3);
		Sheet sheet = WB3.getSheet("Data Order in 3 D Array");
		int rows = sheet.getRows();
		int columns = sheet.getColumns();
		String contents;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				contents = sheet.getCell(j,i).getContents();
				System.out.println("Coloumn ,  Row =  "+j+i+" "+contents);
			}		}	}}