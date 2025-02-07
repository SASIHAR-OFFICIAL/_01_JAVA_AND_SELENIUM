package _S_01_IT_ST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class IT_ST_02_Select_2_Sasi_2020 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		
		WebDriver d=new ChromeDriver();
		d.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"txt_unam\"]")).sendKeys("sylix");
		d.findElement(By.xpath("//*[@id=\"txt_pass\"]")).sendKeys("admin");
		d.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
		d.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[2]/a")).click();
		Thread.sleep(5000);
		Select state=new
		Select(d.findElement(By.id("ContentPlaceHolder1_ddl_state")));
		//state.selectByIndex(7);
		state.selectByVisibleText("Tamil Nadu");
	
			
			}

}
