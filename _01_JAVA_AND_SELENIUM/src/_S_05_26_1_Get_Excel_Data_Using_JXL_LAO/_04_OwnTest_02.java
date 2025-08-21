package _S_05_26_1_Get_Excel_Data_Using_JXL_LAO;

import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _04_OwnTest_02 {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		 // Load Excel file
        FileInputStream fis = new FileInputStream("C:\\WebDriver\\TESTING FILES\\XLS FILES.xls");
        Workbook wb = Workbook.getWorkbook(fis);
        Sheet sh = wb.getSheet("BRM Login1");   
        
        // Get total rows and cols
        int rows = sh.getRows();
        int cols = sh.getColumns();
        
        System.out.println("Total Rows: " + rows + " | Total Cols: " + cols);

        // Launch Browser (Firefox example, set geckodriver path if needed)
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        // Example: read username and password from excel
        String username = sh.getCell(0, 1).getContents(); // col=0,row=1
        String password = sh.getCell(1, 1).getContents(); // col=1,row=1
        
        System.out.println("Username: " + username + " | Password: " + password);

        // Open website and login (example: demo site)
        driver.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");

//        WebElement userField = driver.findElement(By.id("username"));
//        WebElement passField = driver.findElement(By.id("password"));
//        WebElement   Login_Button = driver.findElement(By.xpath("//*[@id=\"Button3\"]"));
//		
//        userField.sendKeys(username);
//        passField.sendKeys(password);
//        Login_Button.click();
        
        
    	driver.navigate().to("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
		WebElement  User_Name = driver.findElement(By.xpath("//input[@name='txt_unam']"));
		User_Name.sendKeys(username);
		WebElement   Pass_Word = driver.findElement(By.xpath("//input[@name='txt_pass']"));
		Pass_Word.sendKeys(password);
		
		Thread.sleep(5000);
		WebElement   Login_Button = driver.findElement(By.xpath("//*[@id=\"Button3\"]"));
		Login_Button.click();

        // Close workbook
        wb.close();
    }
}