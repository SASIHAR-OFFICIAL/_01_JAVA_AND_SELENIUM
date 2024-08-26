package _S_01_IT_ST;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IT_ST_11_Implicitly_Wait_3_Bringed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://executeautomation.com/demosite/index.html?UserName=Rajkumar&Password=coolbuddy9&Login=Login");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		Actions act=new Actions(d);
		WebElement moveonmenu = d.findElement(By.xpath(".//*[@id='Automation Tools']"));
		act.moveToElement(moveonmenu).build().perform();
		Thread.sleep(3000);
		WebElement elem2 = d.findElement(By.xpath(".//*[@id='Selenium']"));
		act.moveToElement(elem2).build().perform();
		Thread.sleep(3000);
		WebElement e3=d.findElement(By.xpath("//*[@id=\"Selenium WebDriver\"]"));
		act.moveToElement(e3).click().build().perform();
		

	}

}
