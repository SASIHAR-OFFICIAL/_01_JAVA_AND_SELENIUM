package _S_05_28_1_Get_Excel_Data_Using_Apache_POI_LAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class _01_Read_Data_From_Excel {

	public void Read_Excel() throws IOException {
		FileInputStream fileInputStream_obj = new FileInputStream("C:\\WebDriver\\TESTING FILES\\XLSX FILES.xlsx");
		Workbook workbook_Obj = new XSSFWorkbook(fileInputStream_obj);
		Sheet sheet_obj = workbook_Obj.getSheet("HRM Login - Copy");
		Iterator<Row> Row_iterator = sheet_obj.iterator();
		
		while(Row_iterator.hasNext()) {
			Row Row_Value = Row_iterator.next();
			Iterator<Cell> Coloumn_iterator = Row_Value.iterator();
			
			while (Coloumn_iterator.hasNext()) {
				Cell CellValue = Coloumn_iterator.next();
				System.out.println("CellValue = "+CellValue);
				workbook_Obj.close();
			}		}	}
	public static void main(String[] args) throws IOException {
		_01_Read_Data_From_Excel OBJ = new _01_Read_Data_From_Excel();
		OBJ.Read_Excel();
		
	}}
