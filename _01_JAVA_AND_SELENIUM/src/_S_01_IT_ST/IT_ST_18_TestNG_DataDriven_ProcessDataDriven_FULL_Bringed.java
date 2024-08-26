package _S_01_IT_ST;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.read.biff.BiffException;

public class IT_ST_18_TestNG_DataDriven_ProcessDataDriven_FULL_Bringed {

	public static void main(String[] args) throws InterruptedException, BiffException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("sylix");
		d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("admin");
        d.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
		d.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[2]/a")).click();
		Select selectByValue = new Select (d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddl_state\"]")));
		Thread.sleep(3000);
		selectByValue.selectByValue("Tamil Nadu");
		
		/*FileInputStream f= new FileInputStream("C:\\ddd.xls");
		Workbook b=Workbook.getWorkbook(f);
		Sheet s = b.getSheet(0);
		int rowcount =s.getRows();
		for(int i=1; i<rowcount; i++){
			String username= s.getCell(0, i).getContents();
			String password=s.getCell(1, i).getContents();
			String cid=s.getCell(2, i).getContents();
			String pid=s.getCell(3,i).getContents();
			String cname=s.getCell(4, i).getContents();
		
			d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/input")).sendKeys(username);
			d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/input")).sendKeys(password);

			
			/*d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[4]/td[2]/input")).click();
			d.findElement(By.xpath("html/body/form/div[4]/div[1]/ul/li[2]/a")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("html/body/form/div[4]/table/tbody/tr[2]/td/input[1]")).sendKeys(cid);
			Thread.sleep(8000);
			d.findElement(By.xpath("html/body/form/div[4]/table/tbody/tr[2]/td/input[2]")).click();
		
			d.findElement(By.xpath("html/body/form/div[4]/table/tbody/tr[5]/td[2]/input")).sendKeys(cname);
			d.findElement(By.xpath("html/body/form/div[4]/table/tbody/tr[2]/td/input[5]")).click();
			Thread.sleep(7000);
			
			d.findElement(By.xpath("html/body/form/div[3]/a")).click();
			/*d.findElement(By.xpath("html/body/form/div[4]/div[1]/ul/li[6]/a")).click();
			d.findElement(By.xpath("html/body/form/div[4]/table/tbody/tr[1]/td[1]/table/tbody/tr/td[3]/input")).click();
			d.findElement(By.xpath("html/body/form/div[4]/table/tbody/tr[3]/td[1]/table/tbody/tr[3]/td/input[1]")).sendKeys(pid);
			d.findElement(By.xpath("html/body/form/div[4]/table/tbody/tr[3]/td[1]/table/tbody/tr[3]/td/input[2]")).click();*/
			
			
		}
			
		
	}

