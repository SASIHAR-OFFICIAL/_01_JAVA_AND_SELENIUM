package _S_05_28_1_Get_Excel_Data_Using_Apache_POI_LAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _01_Particular_Cell {

	public void Read_Excel() throws IOException {
		FileInputStream fileInputStream_obj = new FileInputStream("C:\\WebDriver\\TESTING FILES\\XLSX FILES.xlsx");
		Workbook workbook_Obj = new XSSFWorkbook(fileInputStream_obj);
		Sheet sheet_obj = workbook_Obj.getSheet("Data Order in xlsx");
		Row row = sheet_obj.getRow(4);
		Cell cell = row.getCell(2);
		RichTextString richStringCellValue = cell.getRichStringCellValue();
		System.out.println(richStringCellValue);
	}
//		Iterator<Row> Row_iterator = sheet_obj.iterator();
//		
//		while(Row_iterator.hasNext()) {
//			Row Row_Next = Row_iterator.next();
//			Iterator<Cell> Row_value = Row_Next.iterator();
//			
//			while (Row_value.hasNext()) {
//				Cell CellValue = Row_value.next();
//				System.out.println("CellValue = "+CellValue);
//				workbook_Obj.close();
//			}		}	
//		}
		
		
	public static void main(String[] args) throws IOException {
		_01_Particular_Cell OBJ = new _01_Particular_Cell();
		OBJ.Read_Excel();
		
	}
	}
