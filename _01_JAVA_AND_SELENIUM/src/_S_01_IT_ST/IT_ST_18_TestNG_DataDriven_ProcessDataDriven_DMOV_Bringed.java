package _S_01_IT_ST;



import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class IT_ST_18_TestNG_DataDriven_ProcessDataDriven_DMOV_Bringed {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException   {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		
		FileInputStream f= new FileInputStream("C:\\book1.xls");
		Workbook b=Workbook.getWorkbook(f);
		Sheet s = b.getSheet(0);
		int rowcount =s.getRows();
		for(int i=1; i<rowcount; i++) {
			String username= s.getCell(0, i).getContents();
			String password=s.getCell(1, i).getContents();
			d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/input"))
			.sendKeys(username);
			d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/input"))
			.sendKeys(password);
			d.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
			Thread.sleep(6000);
			d.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();
				
		}
		d.close();
	}
}


	


