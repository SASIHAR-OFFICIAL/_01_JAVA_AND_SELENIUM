package _S_05_26_a_3_Ways_to_Get_Data_in_JXL;

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

public class _03_Two_Dimenstional_Array_Using_in_WebSite {

	public String[][] Read_Excel() throws IOException, BiffException {
		FileInputStream fileInputStream_obj = new FileInputStream("C:\\WebDriver\\TESTING FILES\\Data Order for 2 Dimensional Array.xls");
		Workbook workbook_Obj = Workbook.getWorkbook(fileInputStream_obj);
		Sheet sheet_obj = workbook_Obj.getSheet(0);
		int rows = sheet_obj.getRows();
		int columns = sheet_obj.getColumns();
		System.out.println("rows ="+rows);
		System.out.println("columns ="+columns);
		String testDataString[][] = new String [rows-1][columns]; // Creating a 2 Dimensional Matrix Array(TestData Array)
																	// rows-1 means 5-1 = 4 Heading not included to create TestData Array 
																	// columns = 2 TestData Array 	
		for(int i =1;i<rows;i++) {
			for(int j =0;j<columns;j++) {
				//first column, next row
				testDataString[i-1][j] = sheet_obj.getCell(j,i).getContents(); //Sending a Cell Content to 2 Dimensional Matrix Array(TestData Array)
			}
		}
		return testDataString;
	}

@DataProvider(name ="LoginData")
public String[][] Login_Data_Provider() throws BiffException, IOException{
	String [][]	data = Read_Excel();
	return data;
}


@Test(dataProvider ="LoginData")
public void Login(String UserName, String Password) {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.navigate().to("C:\\WebDriver\\TESTING FILES\\input.html");
	WebElement User = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
	User.sendKeys(UserName);

	WebElement Pass = driver.findElement(By.xpath("//*[@id=\"lname\"]"));
	Pass.sendKeys(Password);

	
}
}	

