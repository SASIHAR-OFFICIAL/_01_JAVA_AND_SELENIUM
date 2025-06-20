package _S_05_28_From_Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class _03_BRM_Login {

	public static void main(String[] args) throws BiffException, IOException {
		
		FileInputStream FIS_obj = new FileInputStream("C:\\WebDriver\\TESTING FILES\\BRM Login.xls");
		Workbook WB_ObjWorkbook = Workbook.getWorkbook(FIS_obj);
		Sheet sheet_ObjSheet = WB_ObjWorkbook.getSheet(0);
		
	String cell1 = sheet_ObjSheet.getCell(0, 4).getContents();
		System.out.println("cell1 = "+cell1);
		String cell2 = sheet_ObjSheet.getCell(1, 4).getContents();
		System.out.println("cell2 = "+cell2);	
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
		WebElement  User_Name = driver.findElement(By.xpath("//input[@name='txt_unam']"));
		User_Name.sendKeys(cell1);
		WebElement   Pass_Word = driver.findElement(By.xpath("//input[@name='txt_pass']"));
		Pass_Word.sendKeys(cell2);
		
		WebElement   Login_Button = driver.findElement(By.xpath("//*[@id=\"Button3\"]"));
		Login_Button.click();
		
	}

}
