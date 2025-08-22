package _S_05_26_2_Excel_Data_to_Web_Using_JXL_LAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class _04_HRM_Login_Excel_Loop {
	
	//Global Declaration
	String [][] data=null;
	WebDriver driver;

	public String[][] Get_Excel_Data() throws FileNotFoundException, IOException, BiffException {
		FileInputStream FileInputStream_Obj = new FileInputStream("C:\\WebDriver\\TESTING FILES\\XLS FILES.xls");
		Workbook Workbook_obj = Workbook.getWorkbook(FileInputStream_Obj);
		Sheet Sheet_Obj = Workbook_obj.getSheet("HRM Login");
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
	public void Login(String userName, String Password) {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement User = driver.findElement(By.xpath("//input[@name='username']"));
		User.sendKeys(userName);

		WebElement Pass = driver.findElement(By.xpath("//input[@type='password']"));
		Pass.sendKeys(Password);

		WebElement Button = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		Button.click();
	}
	
	@AfterTest
	public void Driver_Close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

	}
}	





