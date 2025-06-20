package _S_05_26_a_3_Ways_to_Get_Data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _02_Using_Iterator {

	public void Read_Excel() throws IOException {
		FileInputStream fileInputStream_obj = new FileInputStream("C:\\WebDriver\\TESTING FILES\\Data Order in xlsx.xlsx");
		Workbook workbook_Obj = new XSSFWorkbook(fileInputStream_obj);
		Sheet sheet_obj = workbook_Obj.getSheetAt(0);
//		Row row = sheet_obj.getRow(1);
//		Cell cell = row.getCell(0);
//		RichTextString richStringCellValue = cell.getRichStringCellValue();
//		System.out.println(richStringCellValue);
//	}
		Iterator<Row> Row_iterator = sheet_obj.iterator();
		
		while(Row_iterator.hasNext()) {
			Row Row_Next = Row_iterator.next();
			Iterator<Cell> Row_value = Row_Next.iterator();
			
			while (Row_value.hasNext()) {
				Cell CellValue = Row_value.next();
				System.out.println("CellValue = "+CellValue);
				workbook_Obj.close();
				
		}}	
		}
		
		
	public static void main(String[] args) throws IOException {
		_02_Using_Iterator OBJ = new _02_Using_Iterator();
		OBJ.Read_Excel();
		
	}
	}
