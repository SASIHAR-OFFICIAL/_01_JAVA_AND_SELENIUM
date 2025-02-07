package _S_01_IT_ST;

import java.io.FileInputStream;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class IT_ST_18_TestNG_dd_2_Sasi_2020 {

	WebDriver d;
	 @BeforeTest
	  public void beforeTest() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
			d=new ChromeDriver();
			d.get("http://demo.automationtesting.in/Register.html");
			d.manage().window().maximize();
			Thread.sleep(5000);
	  }

 @Test
 public void f() throws InterruptedException, BiffException, IOException {
	  
	  
	  
	  FileInputStream f=new FileInputStream("C:\\Users\\JAYASREE SASIHAR\\Desktop\\datadriven\\dd.xls");
		Workbook b=Workbook.getWorkbook(f);
		Sheet s=b.getSheet(0);
		for (int i=1;i<=4;i++)
		{
			//first column, next row
		String fn=s.getCell(0,i).getContents();
		String ln=s.getCell(1,i).getContents();
		String ad=s.getCell(2,i).getContents();
		String email=s.getCell(3,i).getContents();
		String pno=s.getCell(4,i).getContents();
		String pass=s.getCell(5,i).getContents();
		String cpass=s.getCell(6,i).getContents();
		
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys(fn);
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(ln);
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys(ad);
		d.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys(email);
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys(pno);
		Thread.sleep(3000);
		d.findElement(By.id("firstpassword")).sendKeys(pass);
		d.findElement(By.id("secondpassword")).sendKeys(cpass);
		d.navigate().refresh();
		
 }
 }

 @AfterTest
 public void afterTest() {
	  d.close();
 
	  
 }
 }