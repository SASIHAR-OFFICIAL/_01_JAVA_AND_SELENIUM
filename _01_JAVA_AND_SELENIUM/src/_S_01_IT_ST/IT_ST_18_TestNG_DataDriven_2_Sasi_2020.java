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


public class IT_ST_18_TestNG_DataDriven_2_Sasi_2020 {
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
	   
	  
	  FileInputStream f=new FileInputStream("H:\\SELENIUM\\Datadriven.xls");
		Workbook b=Workbook.getWorkbook(f);
		Sheet s=b.getSheet(0);
		for (int x=1;x<=4;x++)
		{
			//first column, next row
		String fn=s.getCell(0,x).getContents();
		String ln=s.getCell(1,x).getContents();
		String ad=s.getCell(2,x).getContents();
		String email=s.getCell(3,x).getContents();
		String pno=s.getCell(4,x).getContents();
		String pass=s.getCell(5,x).getContents();
		String cpass=s.getCell(6,x).getContents();
		
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