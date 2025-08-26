package _S_05_26_2_Excel_Data_to_Web_Using_JXL_LAO_Own;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class _01_OwnTest {

	@DataProvider(name = "DisrictSearch")
	public static String[][] DataInExcel() throws BiffException, IOException {

		FileInputStream FIS4 = new FileInputStream("C:\\WebDriver\\TESTING FILES\\XLS FILES.xls");
		Workbook WB_Obj4 = Workbook.getWorkbook(FIS4);
		Sheet sheet = WB_Obj4.getSheet("SEARCH");
		int rows = sheet.getRows();
		int columns = sheet.getColumns();
		
		 // Create 2D array for TestNG DataProvider
		String[][] contents = new String[rows][columns];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				contents[i][j] = sheet.getCell(j, i).getContents();
				System.out.println("Row " + i + " Col " + j + " = " + contents[i][j]);
				
			} 
		}
		return contents;
	}
	@Test(dataProvider = "DisrictSearch")
	public void BingSearch(String DisrictName) throws InterruptedException   {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.bing.com/");

		WebElement Search_Bar = driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
		Search_Bar.sendKeys(DisrictName);
		Thread.sleep(3000);
		Search_Bar.sendKeys(Keys.ENTER);
	}
}
