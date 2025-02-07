package _S_04_Parthasarathy;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class datadri_Parthasarthy {

	public static void main(String[] args ) throws InterruptedException, BiffException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("http://demo.automationtesting.in/Register.html");
d.manage().window().maximize();
Thread.sleep(2000);
FileInputStream f=new FileInputStream("C:\\datadriventest.xls");
Workbook b=Workbook.getWorkbook(f);
Sheet s=b.getSheet(0);
int rowcount=s.getRows();
for(int i=1;i<rowcount;i++)
{String FirstName=s.getCell(0,i).getContents();
String lastname=s.getCell(1,i).getContents();
String Address=s.getCell(2,i).getContents();
String Emailaddress=s.getCell(3,i).getContents();
String Phone=s.getCell(4,i).getContents();
d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys(FirstName);
d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(lastname);
}

	}	
	}

