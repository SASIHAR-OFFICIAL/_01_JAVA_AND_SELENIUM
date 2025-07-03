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


public class Google_Search_From_Excel3 {

	public static Object[][] SearchContent() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\WebDriver\\TESTING FILES\\SEARCH.xlsx");
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
    public void SearchGoogle(String searchData) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchData);
        searchBox.submit();

        System.out.println("Searched for: " + searchData);
        driver.quit();
    }
}