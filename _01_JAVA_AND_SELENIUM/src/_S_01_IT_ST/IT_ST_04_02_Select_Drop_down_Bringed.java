package _S_01_IT_ST;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IT_ST_04_02_Select_Drop_down_Bringed {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	d.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
				 Thread.sleep(2000);
				 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
							 
				 		d.findElement(By.xpath("//*[@id='txt_unam']")).sendKeys("sylix");
				 		 	
				 			d.findElement(By.xpath("//*[@id='txt_pass']")).sendKeys("admin");
				 			
				 			d.findElement(By.xpath("//*[@id=\'Button3\']")).click();
				 			Thread.sleep(6000);
				 			//d.switchTo().alert().accept();
				 						 			
				 		//	Alert aa = d.switchTo().alert();
				 			//System.out.println("Alert Text\n" +aa.getText());
				 			//d.switchTo().alert().accept();
				 			//d.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[2]/a")).click();
				 			d.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[2]/a")).click();
				 			Thread.sleep(6000);
				 			d.findElement(By.id("ContentPlaceHolder1_txt_compname")).sendKeys("infotest");
				 			Thread.sleep(4000);
				 			Select state=new Select(d.findElement(By.id("ContentPlaceHolder1_ddl_state")));
				 			state.selectByIndex(16);
				 		//state.selectByVisibleText("Manipur");

			 			
				 			//Thread.sleep(60000);
				 			//d.switchTo().alert().getText();
				 			//d.switchTo().alert().accept();	 			
				 
				 			Thread.sleep(65000);
				

	}

}
