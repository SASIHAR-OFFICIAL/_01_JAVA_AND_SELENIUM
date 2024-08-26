package _S_04_Parthasarathy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cbr_Parthasarthy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
		d.findElement(By.id("txt_unam")).sendKeys("sylix");
		d.findElement(By.id("txt_pass")).sendKeys("admin");
		d.findElement(By.xpath("//*[@id=\"Button3\"]")).click();

	}

}
