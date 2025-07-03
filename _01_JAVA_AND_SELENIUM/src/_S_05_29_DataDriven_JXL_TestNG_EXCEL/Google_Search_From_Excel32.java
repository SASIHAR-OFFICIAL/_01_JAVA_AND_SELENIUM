package _S_05_29_DataDriven_JXL_TestNG_EXCEL;

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

public class Google_Search_From_Excel32 {
	public static Object[][] SearchContent() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\WebDriver\\TESTING FILES\\SEARCH.xlsx");
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        int rowCount = sheet.getPhysicalNumberOfRows(); // total rows including header
        Object[][] data = new Object[rowCount][1];  // excluding header

        for (int i = 1; i < rowCount; i++) {  // start from 1 to skip header
            Row row = sheet.getRow(i);
            Cell cell = row.getCell(0); // assume first column has search term
            data[i - 1][0] = (cell != null) ? cell.getStringCellValue() : "";
        }

        workbook.close();
        return data;
    }

    @DataProvider(name = "SearchData")
    public Object[][] Search_Data_Provider() throws IOException {
        return SearchContent();
    }

    @Test(dataProvider = "SearchData")
    public void SearchGoogle(String searchData) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchData);
        searchBox.submit();

        System.out.println("Searched for: " + searchData);

        // Optional: Close browser
        // driver.quit();
    }
}