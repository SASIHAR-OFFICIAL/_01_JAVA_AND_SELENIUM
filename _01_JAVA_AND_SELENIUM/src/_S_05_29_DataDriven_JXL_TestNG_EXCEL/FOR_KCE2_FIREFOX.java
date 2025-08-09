package _S_05_29_DataDriven_JXL_TestNG_EXCEL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class FOR_KCE2_FIREFOX {
	
	//Global Declaration
	String [][] data=null;
	WebDriver driver;

	public String[][] Get_Excel_Data() throws FileNotFoundException, IOException, BiffException {
		FileInputStream FileInputStream_Obj = new FileInputStream("C:\\WebDriver\\TESTING FILES\\II A.xls");
		Workbook Workbook_obj = Workbook.getWorkbook(FileInputStream_Obj);
		Sheet Sheet_Obj = Workbook_obj.getSheet(0);
		int rows = Sheet_Obj.getRows();
		int columns = Sheet_Obj.getColumns();
		System.out.println("rows ="+rows);
		System.out.println("columns ="+columns);

		String testDataString[][] = new String [rows-1][columns]; // Creating a 2 Dimensional Matrix Array(TestData Array)
																	// rows-1 means 5-1 = 4 Heading not included to create TestData Array 
																	// columns = 2 TestData Array 	
		for(int i =1;i<rows;i++) {
			for(int j =0;j<columns;j++) {
				//first column, next row
				testDataString[i-1][j] = Sheet_Obj.getCell(j,i).getContents();
			}
		}
		return testDataString;
	}

	
	@BeforeTest
	public void Browser_Open() {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			}
	
	
	@DataProvider(name ="LoginData")
	public String[][] Login_Data_Provider() throws BiffException, IOException{
		data = Get_Excel_Data();
		return data;
	}


	
	@Test(dataProvider ="LoginData")
	public void Login(String userName, String Password) throws InterruptedException {
		driver.navigate().to("http://10.10.10.1:8080/Automation/studentOnline.do?param=login&Id=2");
		WebElement User = driver.findElement(By.xpath("//*[@id=\"rollNo\"]"));
		User.sendKeys(userName);

		WebElement Pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pass.sendKeys(Password);

		WebElement Button = driver.findElement(By.xpath("/html/body/div[6]/div/div/form/table/tbody/tr[2]/td/table/tbody/tr[3]/td/div/input"));
		Button.click();
		
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		WebElement CBCS = driver.findElement(By.xpath("//*[@id=\"mnuCbcs\"]/a/span[2]"));
		a.moveToElement(CBCS).build().perform();
		
		Actions B=new Actions(driver);
		WebElement ENROL = driver.findElement(By.xpath("//*[@id=\"mnuCbcs\"]/ul/li[1]/a"));
		B.moveToElement(ENROL).build().perform();
		
		Actions C=new Actions(driver);
		WebElement SEM3 = driver.findElement(By.xpath("//*[@id=\"mnuCbcs\"]/ul/li[1]/ul/li[3]/a"));
		C.moveToElement(SEM3).build().perform();
		SEM3.click();
		
		
		
		
	}
	
	@AfterTest
	public void Driver_Close() throws InterruptedException {
		Thread.sleep(3000);
		//driver.quit();

	}
}	





