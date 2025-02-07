package _S_01_IT_ST;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IT_ST_18_TestNG_Junit_juc_Bringed {
	WebDriver d;
	@Before
	public void start() {
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver\\chromedriver.exe");
		 d=new ChromeDriver();
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
	}

	@Test
	public void testv() {
		fail("Not yet implemented");
		d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("sylix");
		d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("admin");
	}
	@Test
	public void testiv() {
		fail("Not yet implemented");
		d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("2745734");
		d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("91823749832");
	}
	@Test
	public void testil() {
		fail("Not yet implemented");
		d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("!#@!@");
		d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/input")).sendKeys("$#@$#");
	}
	@Test
	public void testb() {
		fail("Not yet implemented");
		d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/input")).sendKeys(" ");
		d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/input")).sendKeys(" ");
	}
	@After
	public void end() {
		d.quit();
	}


}
/*System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");

FileInputStream f= new FileInputStream("C:\\book1.xls");
Workbook b=Workbook.getWorkbook(f);
Sheet s = b.getSheet(0);
int rowcount =s.getRows();
for(int i=1; i<rowcount; i++) {
	String username= s.getCell(0, i).getContents();
	String password=s.getCell(1, i).getContents();
	d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/input")).sendKeys(username);
	d.findElement(By.xpath("html/body/form/div[3]/table/tbody/tr[3]/td/table/tbody/tr[3]/td[2]/input")).sendKeys(password);

	
}*/