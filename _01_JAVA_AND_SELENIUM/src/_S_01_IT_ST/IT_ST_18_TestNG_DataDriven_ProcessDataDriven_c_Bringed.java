package _S_01_IT_ST;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class IT_ST_18_TestNG_DataDriven_ProcessDataDriven_c_Bringed {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException   {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
		
		
		 FileInputStream f= new FileInputStream("C:\\SeleniumTraining\\ddjxl1.xls");
		Workbook b=Workbook.getWorkbook(f);
		Sheet s = b.getSheet(0);
		int rowcount =s.getRows();
		for(int i=1; i<rowcount; i++){
			String username= s.getCell(0, i).getContents();
			String password=s.getCell(1, i).getContents();
			String cid=s.getCell(2, i).getContents();
			String pid=s.getCell(3,i).getContents();
			//String cname=s.getCell(4, i).getContents();
			
			d.findElement(By.xpath("//*[@id=\"txt_unam\"]")).sendKeys(username);
			d.findElement(By.xpath("//*[@id='txt_pass']")).sendKeys(password);
			d.findElement(By.xpath("//*[@id=\'Button3\']")).click();
			Thread.sleep(5000);
			d.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();

		
			//d.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();
			
			/*d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_customerid\"]")).sendKeys(cid);
			d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_phoneno\"]")).sendKeys(pid);
			d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_but_insert\"]")).click();*/
	
			
		}

			
	}

}
 