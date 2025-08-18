package _S_05_28_Excel_Data_to_Web_Using_Apache_POI;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Google_Search_From_Excel {

	public static Object[][] SearchContent() throws IOException {

		FileInputStream FIS = new FileInputStream("C:\\WebDriver\\TESTING FILES\\SEARCH.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(FIS);
		XSSFSheet sheet_obj = wb.getSheetAt(0);


	    int rowCount = sheet_obj.getPhysicalNumberOfRows();

        Object[][] data = new Object[rowCount][1];

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet_obj.getRow(i);
            Cell cell = row.getCell(0);
            data[i][0] = cell.getStringCellValue();
        }

        wb.close();
        FIS.close();
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



