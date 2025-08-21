package _S_05_28_Excel_Data_to_Web_Using_Apache_POI;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Google_Search_From_Excel2 {

	public static Object[][] SearchContent() throws IOException {

		FileInputStream FIS = new FileInputStream ("C:\\WebDriver\\TESTING FILES\\XLSX FILES.xlsx");
		//FileInputStream fileInputStream_obj = new FileInputStream("C:\\WebDriver\\TESTING FILES\\Data Order in xlsx.xlsx");
		Workbook workbook_Obj = new XSSFWorkbook(FIS);
		Sheet sheet_obj = workbook_Obj.getSheet("SEARCH");
		Row row = sheet_obj.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println("row ="+row);
		System.out.println("cell ="+cell);

//		RichTextString richStringCellValue = cell.getRichStringCellValue();
//		System.out.println(richStringCellValue);
//	}
		Iterator<Row> Row_iterator = sheet_obj.iterator();
		Object[][] data = new Object[1][1];
		while(Row_iterator.hasNext()) {
			Row Row_Next = Row_iterator.next();
			Iterator<Cell> Row_value = Row_Next.iterator();
			
			while (Row_value.hasNext()) {
				Cell CellValue = Row_value.next();
				System.out.println("CellValue = "+CellValue);
				workbook_Obj.close();
				 data[0][0] = CellValue.getStringCellValue();
		}}
		return data;	
		}
		

	@DataProvider(name ="SearchData")
	public Object[][] Search_Data_Provider() throws IOException{
		Object[][] data = SearchContent();
		return data;
	}


	@Test(dataProvider ="SearchData")
	public void Login(String SearchData) {
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.google.com/");
		WebElement SearchArea = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		SearchArea.sendKeys(SearchData);

		WebElement Search_Click = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		Search_Click.click();

	}
}



