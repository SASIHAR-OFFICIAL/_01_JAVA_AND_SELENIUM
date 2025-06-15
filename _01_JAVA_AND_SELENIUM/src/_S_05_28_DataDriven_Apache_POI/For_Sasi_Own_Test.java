package _S_05_28_DataDriven_Apache_POI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class For_Sasi_Own_Test {

	public void Read_Excel() throws IOException {
		FileInputStream fileInputStream_obj = new FileInputStream("C:\\WebDriver\\TESTING FILES\\HRM Login - Copy - SASI.xlsx");
		Workbook workbook_Obj = new XSSFWorkbook(fileInputStream_obj);
		Sheet sheet_obj = workbook_Obj.getSheetAt(0);
		Row row = sheet_obj.getRow(3);
		Cell cell = row.getCell(1);
		RichTextString richStringCellValue = cell.getRichStringCellValue();
		System.out.println(richStringCellValue);
//		Iterator<Row> Row_iterator = sheet_obj.iterator();
//		
//		while(Row_iterator.hasNext()) {
//			Row Row_Value = Row_iterator.next();
//			Iterator<Cell> Coloumn_iterator = Row_Value.iterator();
//			
//			while (Coloumn_iterator.hasNext()) {
//				Cell CellValue = Coloumn_iterator.next();
//				System.out.println("CellValue = "+CellValue);
//				workbook_Obj.close();
//			}		}	
		}
		
		
	public static void main(String[] args) throws IOException {
		For_Sasi_Own_Test OBJ = new For_Sasi_Own_Test();
		OBJ.Read_Excel();
		
	}
	}
