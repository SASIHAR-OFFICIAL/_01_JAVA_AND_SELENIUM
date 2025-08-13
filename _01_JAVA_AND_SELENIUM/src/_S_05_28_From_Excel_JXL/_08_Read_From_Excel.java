package _S_05_28_From_Excel_JXL;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class _08_Read_From_Excel {

	public static void main(String[] args) throws BiffException, IOException {
		FileInputStream FIS = new FileInputStream("C:\\WebDriver\\TESTING FILES\\II A.xls");
		Workbook wb_obj = Workbook.getWorkbook(FIS);
		Sheet sheet = wb_obj.getSheet(0);
				  
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

