package _S_05_26_a_3_Write_in_Excel;

import java.io.File;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class WritingExcelDemo {
 public static void main(String[] args) throws Exception {
  File file = new File("C:\\WebDriver\\TESTING FILES\\JXL WRITE.xls");
	 
  
  WritableWorkbook wb = Workbook.createWorkbook(file);
  WritableSheet sht = wb.createSheet("data", 0);
  
  Label ll = new Label(0, 0, "Result");
  sht.addCell(ll);
  sht.addCell(new Label(0, 1, "Pass"));
  sht.addCell(new Label(0, 2, "Fail"));
  
  wb.write();
  wb.close();
  System.out.println("Workbook is created");
 }
}