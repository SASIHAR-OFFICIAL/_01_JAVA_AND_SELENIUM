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

public class For_Sasi_Own_Test_01 {

	public void Read_Excel() throws IOException {
		FileInputStream fileInputStream_obj = new FileInputStream("C:\\WebDriver\\TESTING FILES\\HRM Login - Copy - SASI.xlsx");
		Workbook workbook_Obj = new XSSFWorkbook(fileInputStream_obj);
		Sheet sheet_obj = workbook_Obj.getSheetAt(0);
		Row row = sheet_obj.getRow(4);
		Cell cell = row.getCell(1);
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
		For_Sasi_Own_Test_01 OBJ = new For_Sasi_Own_Test_01();
		OBJ.Read_Excel();
		
	}
	}
