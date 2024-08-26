package _S_01_IT_ST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IT_ST_01_Gmail_Login_1_Teached {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AXo7B7VzzWMuXlwy7xmZZmePzRhW5ZD0VHf7cbR45vNtjTLvKusl6qOlLAPPqqHCqUM3jjti9ZTJ-g&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-2046707234%3A1691480806890501");
		d.manage().window().maximize();
		Thread.sleep(5000);
		d.findElement(By.id("identifierId")).sendKeys("s.sasihar");
		d.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
		Thread.sleep(5000);
		/*d.findElement(By.name("password")).sendKeys("st1855300");
		d.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		Thread.sleep(10000);
		d.findElement(By.className("gb_1e")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"gb23\"]/span[1]")).click();
		Thread.sleep(30000);
        d.findElement(By.xpath("//*[@id=\":12j\"]/div/div")).click();*/
       	
	
	}

}
