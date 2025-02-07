package _S_01_IT_ST;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class IT_ST_18_TestNG_Junit_jclass_Bringed {
	WebDriver d;
	@Before
	public void open() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://brm.tremplintech.in/web_pages/login.aspx");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test
	void test() {
		d.findElement(By.id("txt_unam")).sendKeys("sylix");
		d.findElement(By.id("txt_pass")).sendKeys("admin");
		d.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
	}

}
