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


public class Google_Search_From_Excelx9 {

	public static Object[][] SearchContent() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\WebDriver\\TESTING FILES\\x9.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);

		int rowCount = sheet.getPhysicalNumberOfRows();
		Object[][] data = new Object[rowCount][1];

		for (int i = 0; i < rowCount; i++) {
			Row row = sheet.getRow(i);
			if (row != null) {
				Cell cell = row.getCell(0);
				data[i][0] = (cell != null) ? cell.getStringCellValue() : "";
				System.out.println("Data from Excel: " + data[i][0]);
			}
		}

		workbook.close();
		fis.close();
		return data;
	}

	@DataProvider(name = "SearchData")
	public Object[][] Search_Data_Provider() throws IOException {
		return SearchContent();
	}

	@Test(dataProvider = "SearchData")
	public void SearchGoogle(String searchData) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		driver.get("https://www.xsaver.io/");
		Thread.sleep(3000);
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"url\"]"));
		searchBox.sendKeys(searchData);
		//Thread.sleep(3000);
		WebElement Down_Button = driver.findElement(By.xpath("//*[@id=\"progress-btn\"]"));
		
		Down_Button.click();
		//Thread.sleep(3000);
		WebElement fez = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/a[1]"));
		fez.click();
		//System.out.println("Searched for: " + searchData);
		Thread.sleep(60000);
		driver.quit();
	}
}