package _S_05_28_DataDriven_Apache_POI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Apache_POI {

	public void Read_Excel() throws IOException {
		FileInputStream fileInputStream_obj = new FileInputStream("C:\\WebDriver\\HRM Login - Copy.xlsx");
		Workbook workbook_Obj = new XSSFWorkbook(fileInputStream_obj);
		Sheet sheet_obj = workbook_Obj.getSheetAt(0);
		Iterator<Row> Row_iterator = sheet_obj.iterator();
		
		while(Row_iterator.hasNext()) {
			Row Row_Value = Row_iterator.next();
			Iterator<Cell> Coloumn_iterator = Row_Value.iterator();
			
			while (Coloumn_iterator.hasNext()) {
				Cell CellValue = Coloumn_iterator.next();
				System.out.println("CellValue = "+CellValue);
			}		}	}
	public static void main(String[] args) throws IOException {
		DataDriven_Apache_POI OBJ = new DataDriven_Apache_POI();
		OBJ.Read_Excel();
	}}
