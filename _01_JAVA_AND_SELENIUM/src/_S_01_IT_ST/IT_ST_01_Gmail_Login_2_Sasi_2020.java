package _S_01_IT_ST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IT_ST_01_Gmail_Login_2_Sasi_2020 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://accounts.google.com");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.findElement(By.id("identifierId")).sendKeys("s.sasihar");
		d.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
		Thread.sleep(5000);
		d.findElement(By.name("password")).sendKeys("st1855300");
		d.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		Thread.sleep(10000);
		d.findElement(By.className("gb_1e")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"gb23\"]/span[1]")).click();
		Thread.sleep(30000);
        d.findElement(By.xpath("//*[@id=\":12j\"]/div/div")).click();
       	
			}

}
