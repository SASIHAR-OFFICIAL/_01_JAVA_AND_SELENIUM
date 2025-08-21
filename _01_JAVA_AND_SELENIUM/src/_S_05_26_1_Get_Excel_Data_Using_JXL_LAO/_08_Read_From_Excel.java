package _S_05_26_1_Get_Excel_Data_Using_JXL_LAO;

import java.io.FileInputStream;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class _08_Read_From_Excel {

	public static void main(String[] args) throws BiffException, IOException {
		FileInputStream FIS = new FileInputStream ("C:\\WebDriver\\TESTING FILES\\XLS FILES.xls");
		Workbook wb_obj = Workbook.getWorkbook(FIS);
		Sheet sheet = wb_obj.getSheet("II A");
				  
		  int noOfRows = sheet.getRows();
		  int noOfColumns = sheet.getColumns();
		  
		  System.out.println("No of Rows: " + noOfRows);
		  System.out.println("No of Columns: " + noOfColumns);
		  
		  System.out.println("Cell02 1st Column and 3rd Row: " 
		  + sheet.getCell(0, 2).getContents());
		  String data = "";
		  for (int i = 0; i < noOfRows; i++) {
		   for (int j = 0; j < noOfColumns; j++) {
		    data = sheet.getCell(j, i).getContents();
		    System.out.print(data + "\t");
		   }
		   System.out.println();
		  }
		  wb_obj.close();
		 }
		

	}

