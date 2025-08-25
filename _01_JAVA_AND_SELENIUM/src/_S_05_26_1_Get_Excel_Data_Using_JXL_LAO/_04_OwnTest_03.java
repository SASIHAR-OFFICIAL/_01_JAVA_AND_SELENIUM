package _S_05_26_1_Get_Excel_Data_Using_JXL_LAO;

import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class _04_OwnTest_03 {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		FileInputStream fis5 = new FileInputStream("C:\\WebDriver\\TESTING FILES\\XLS FILES.xls");
		Workbook Wb_Obj5 = Workbook.getWorkbook(fis5);
		Sheet sheet = Wb_Obj5.getSheet("SEARCH");
		String contents = sheet.getCell(0, 0).getContents();
		System.out.println("contents = "+contents);
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.bing.com/");
		
		WebElement Search_Bar = driver.findElement(By.xpath("//*[@id=\"sb_form_q\"]"));
		Search_Bar.sendKeys(contents);
		Thread.sleep(3000);
		Search_Bar.sendKeys(Keys.ENTER);
		
		

	}

}
