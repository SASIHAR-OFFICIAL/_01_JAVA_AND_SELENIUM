package _S_05_29_DataDriven_JXL_TestNG_EXCEL;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import javax.swing.plaf.basic.BasicArrowButton;

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

public class Google_Search_From_Excel {

	public static String[][] SearchContent() throws BiffException, IOException {

		FileInputStream FIS = new FileInputStream("C:\\WebDriver\\TESTING FILES\\SEARCH.xls");
		Workbook wb = Workbook.getWorkbook(FIS);
		Sheet sheet_obj = wb.getSheet(0);

		int rows = sheet_obj.getRows();
		int columns = sheet_obj.getColumns();
		System.out.println(rows);
		System.out.println(columns);
		
		
		String search[][] = new String [rows][columns];

		for(int i =1;i<rows;i++) {
			for(int j =0;j<columns;j++) {
				//first column, next row
				search[i-1][j] = sheet_obj.getCell(j,i).getContents(); //Sending a Cell Content to 2 Dimensional Matrix Array(TestData Array)
			}
		}
		return search;
	}
	@DataProvider(name ="LoginData")
	public String[]Login_Data_Provider() throws BiffException, IOException{
		String []	data = Read_Excel_for_Serach();
		return data;
	}
	private String[] Read_Excel_for_Serach() {
		// TODO Auto-generated method stub
		return null;
	}
	@Test(dataProvider ="LoginData")
	public void Login(String SearchData) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://https://www.google.com/");
		WebElement SearchArea = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		SearchArea.sendKeys(SearchData);
		
		WebElement Search_Click = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		Search_Click.click();
	
	}
	}



