package _S_01_IT_ST;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class IT_ST_17_Data_Driven_1_Teached {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException   {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("http://demo.automationtesting.in/Register.html");
		FileInputStream f=new FileInputStream("H:\\SELENIUM\\Datadriven.xls");
		Workbook b=Workbook.getWorkbook(f);
		Sheet s=b.getSheet(0);
		
		for(int x=1;x<=5;x++)
			
		{
			Thread.sleep(4000);
		
		String fn=s.getCell(0,x).getContents();
		String ln=s.getCell(1,x).getContents();
		String addr=s.getCell(2,x).getContents();
		String email=s.getCell(3,x).getContents();
		String pno=s.getCell(4,x).getContents();
		String pass=s.getCell(5,x).getContents();
		String cpass=s.getCell(6,x).getContents();
			
		
		Thread.sleep(3000);
		
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys(fn);
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(ln);
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys(addr);
		d.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys(email);
		d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys(pno);
		Thread.sleep(3000);
        d.findElement(By.xpath("//*[@id=\"firstpassword\"]")).sendKeys(pass);
		d.findElement(By.xpath("//*[@id=\"secondpassword\"]")).sendKeys(cpass);
	    d.navigate().refresh();
	   
			}
		}
	}	
	