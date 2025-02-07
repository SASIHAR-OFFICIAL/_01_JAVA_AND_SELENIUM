package _S_01_IT_ST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IT_ST_22_Type_and_Search_Form_Bringed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://amazon.in");
		Thread.sleep(6000);
		d.manage().window().maximize();
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung A50");
		d.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		
		d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div[2]/div[1]/div/div/span/a/div/img")).click();
		Thread.sleep(7000);
	WebElement w=d.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
	w.click();
}
}