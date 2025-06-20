package _S_05_27_DataDriven_TestNG_Data_Inside;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

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

public class _01_HRM_Login_String {
	String[][] data =	{
			{"Admin","admin123"},
			{"admin123","Admin"},
			{"Admin123","admin123"},
			{"Admin1","admin123"}
		};
	
	@DataProvider(name ="LoginData")
	public String[][] Login_Data_Provider(){
	return data;
	}
	
	@Test(dataProvider ="LoginData")
	public void Login(String userName, String Password) {
		WebDriver driver;
		driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement User = driver.findElement(By.xpath("//input[@name='username']"));
		User.sendKeys(userName);
		
		WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
		Pass.sendKeys(Password);
		
		WebElement Button = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		Button.click();
			}
	}

	

//	public void Get_Excel_Data() throws BiffException, IOException {
//		FileInputStream FileInputStream_Obj = new FileInputStream("C:\\WebDriver\\HRM Login.xls");
//		Workbook Workbook_obj = Workbook.getWorkbook(FileInputStream_Obj);
//		Sheet Sheet_Obj = Workbook_obj.getSheet(0);
//		int rows = Sheet_Obj.getRows();
//		int columns = Sheet_Obj.getColumns();
//
//		String testDataString[][] = new String [rows-1][columns];
//		for(int i =1;i<rows;i++) {
//			for(int j =1;j<columns;j++) {
//				testDataString[i-1][j] = Sheet_Obj.getCell(i,j).getContents();
//			}
//		}
//		return testDataString;
//		}
	
	
	

