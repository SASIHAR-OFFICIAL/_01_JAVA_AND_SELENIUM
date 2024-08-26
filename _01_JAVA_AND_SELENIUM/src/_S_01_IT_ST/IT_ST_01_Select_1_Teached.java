package _S_01_IT_ST;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IT_ST_01_Select_1_Teached {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"txt_unam\"]")).sendKeys("sylix");
		d.findElement(By.xpath("//*[@id=\"txt_pass\"]")).sendKeys("admin");
		d.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[6]/a")).click();
		Select product=new
		Select(d.findElement(By.name("ctl00$ContentPlaceHolder1$ddl_prodcate")));
		Thread.sleep(5000);
		//product.selectByIndex(10);
		product.selectByVisibleText("watch");
	}

}
