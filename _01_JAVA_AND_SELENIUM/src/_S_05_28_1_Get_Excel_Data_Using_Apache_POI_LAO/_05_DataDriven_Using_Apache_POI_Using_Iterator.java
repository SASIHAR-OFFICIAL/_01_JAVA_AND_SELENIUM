package _S_05_28_1_Get_Excel_Data_Using_Apache_POI_LAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _05_DataDriven_Using_Apache_POI_Using_Iterator {

	public static void main(String[] args) throws IOException {
		//FileInputStream fis = new FileInputStream("C:\\WebDriver\\TESTING FILES\\ALL IN ONE UPDATED.xlsx");
		FileInputStream fis = new FileInputStream("C:\\WebDriver\\TESTING FILES\\XLSX FILES.xlsx");
		XSSFWorkbook XW = new XSSFWorkbook(fis);
		XSSFSheet XSheet = XW.getSheet("1 to 100");

		Iterator<Row> iterator_in_Sheet = XSheet.iterator();

		while(iterator_in_Sheet.hasNext()) {
			Row Row = iterator_in_Sheet.next();
			Iterator<Cell> row0_cell0 = Row.iterator();

			while(row0_cell0.hasNext()) {
				Cell Cell_Value = row0_cell0.next();
				
				DataFormatter dF = new DataFormatter();
				String formatCellValue = dF.formatCellValue(Cell_Value);
				System.out.println(formatCellValue);
			}
		}
	}
}
