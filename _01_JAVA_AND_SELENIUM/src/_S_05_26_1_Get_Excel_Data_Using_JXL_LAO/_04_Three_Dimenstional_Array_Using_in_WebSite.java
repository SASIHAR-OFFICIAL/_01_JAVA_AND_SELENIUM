package _S_05_26_1_Get_Excel_Data_Using_JXL_LAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;




public class _04_Three_Dimenstional_Array_Using_in_WebSite {

	public String[][] Read_Excel() throws IOException, BiffException {
		 FileInputStream fis = new FileInputStream("C:\\WebDriver\\TESTING FILES\\Data Order for 3 Dimensional Array.xls");
	        Workbook workbook = Workbook.getWorkbook(fis);
	        Sheet sheet = workbook.getSheet(0);
	        int rows = sheet.getRows();
	        int columns = sheet.getColumns();
	        System.out.println("rows ="+rows);
	        System.out.println("columns ="+columns);
	        

	        String[][] testData = new String[rows - 1][columns]; // Exclude header row

	        for (int i = 1; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                testData[i - 1][j] = sheet.getCell(j, i).getContents();
	            }
	        }
	        return testData;
	    }

	    @DataProvider(name = "LoginData")
	    public String[][] Login_Data_Provider() throws BiffException, IOException {
	        return Read_Excel();
	    }



@Test(dataProvider ="LoginData")
public void Login(String UserName, String Password, String data) {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.navigate().to("C:\\WebDriver\\TESTING FILES\\input2.html");
	
	WebElement User = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
	User.sendKeys(UserName);
	

	WebElement Pass = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
	Pass.sendKeys(Password);
	
	WebElement data2 = driver.findElement(By.xpath("//*[@id=\" DATA 02\"]"));
	data2.sendKeys(data);
	

	driver.quit();
}
}	

