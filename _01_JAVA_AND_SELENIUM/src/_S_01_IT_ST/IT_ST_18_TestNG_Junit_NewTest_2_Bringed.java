package _S_01_IT_ST;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class IT_ST_18_TestNG_Junit_NewTest_2_Bringed {

	WebDriver d;

	@Test
	public void f() throws InterruptedException, BiffException, IOException {

		FileInputStream f= new FileInputStream("C:\\SeleniumTraining\\ddjxl1.xls");
		Workbook b=Workbook.getWorkbook(f);
		Sheet s = b.getSheet(0);
		int rowcount =s.getRows();
		for(int i=1; i<=rowcount; i++){
			String username= s.getCell(0, i).getContents();
			String password=s.getCell(1, i).getContents();
			String cid=s.getCell(2, i).getContents();
			String pid=s.getCell(3,i).getContents();
			//String cname=s.getCell(4, i).getContents();

			File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(src, new File("C:/selenium/error.png"));

			d.findElement(By.xpath("//*[@id='txt_unam']")).sendKeys(username);
			File src1= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(src1, new File("C:/selenium/error1.png"));

			d.findElement(By.xpath("//*[@id='txt_pass']")).sendKeys(password);
			d.findElement(By.xpath("//*[@id=\'Button3\']")).click();
			File src2= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(src2, new File("C:/selenium/error2.png"));

			//d.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();

			d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_customerid\"]")).sendKeys(cid);
			d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_phoneno\"]")).sendKeys(pid);
			d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_but_insert\"]")).click();

		}

	}
	@Test
	public void fvalid() throws InterruptedException, IOException {


		File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);


		FileUtils.copyFile(src, new File("C:/selenium/error.png"));


		d.findElement(By.xpath("//*[@id='txt_unam']")).sendKeys("sarathivbs");
		File src1= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src1, new File("C:/selenium/error1.png"));

		d.findElement(By.xpath("//*[@id='txt_pass']")).sendKeys("Sps@123#");
		d.findElement(By.xpath("//*[@id=\'Button3\']")).click();
		File src2= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);


		FileUtils.copyFile(src2, new File("C:/selenium/error2.png"));

		//d.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();

		d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_customerid\"]")).sendKeys("cid");
		d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_phoneno\"]")).sendKeys("pid");
		d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_but_insert\"]")).click();



	}
	@Test
	public void finvalid() throws InterruptedException, IOException, BiffException {

		FileInputStream f= new FileInputStream("C:\\SeleniumTraining\\ddjxl1.xls");
		Workbook b=Workbook.getWorkbook(f);
		Sheet s = b.getSheet(0);
		int rowcount =s.getRows();
		for(int i=1; i<=rowcount; i++){
			String username= s.getCell(0, i).getContents();
			String password=s.getCell(1, i).getContents();
			String cid=s.getCell(2, i).getContents();
			String pid=s.getCell(3,i).getContents();
			//String cname=s.getCell(4, i).getContents();

			File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);


			FileUtils.copyFile(src, new File("C:/selenium/error.png"));


			d.findElement(By.xpath("//*[@id='txt_unam']")).sendKeys(" ");
			File src1= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(src1, new File("C:/selenium/error1.png"));

			d.findElement(By.xpath("//*[@id='txt_pass']")).sendKeys(" ");
			d.findElement(By.xpath("//*[@id=\'Button3\']")).click();
			File src2= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);


			FileUtils.copyFile(src2, new File("C:/selenium/error2.png"));

			//d.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();

			d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_customerid\"]")).sendKeys(cid);
			d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_phoneno\"]")).sendKeys(pid);
			d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_but_insert\"]")).click();

		}

	}
	@Test
	public void fillegal() throws InterruptedException, IOException, BiffException {

		FileInputStream f= new FileInputStream("C:\\SeleniumTraining\\ddjxl1.xls");
		Workbook b=Workbook.getWorkbook(f);
		Sheet s = b.getSheet(0);
		int rowcount =s.getRows();
		for(int i=1; i<=rowcount; i++){
			String username= s.getCell(0, i).getContents();
			String password=s.getCell(1, i).getContents();
			String cid=s.getCell(2, i).getContents();
			String pid=s.getCell(3,i).getContents();
			//String cname=s.getCell(4, i).getContents();

			File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);


			FileUtils.copyFile(src, new File("C:/selenium/error.png"));


			d.findElement(By.xpath("//*[@id='txt_unam']")).sendKeys(username);
			File src1= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(src1, new File("C:/selenium/error1.png"));

			d.findElement(By.xpath("//*[@id='txt_pass']")).sendKeys(password);
			d.findElement(By.xpath("//*[@id=\'Button3\']")).click();
			File src2= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);


			FileUtils.copyFile(src2, new File("C:/selenium/error2.png"));

			//d.findElement(By.xpath("//*[@id=\"LinkButton1\"]")).click();

			d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_customerid\"]")).sendKeys(cid);
			d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_txt_phoneno\"]")).sendKeys(pid);
			d.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_but_insert\"]")).click();
		}


	}
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
	}

	@AfterClass
	public void afterClass() {
		d.close();
	}

}
