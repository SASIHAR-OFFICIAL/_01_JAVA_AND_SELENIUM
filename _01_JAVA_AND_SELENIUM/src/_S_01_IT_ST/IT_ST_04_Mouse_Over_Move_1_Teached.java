package _S_01_IT_ST;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IT_ST_04_Mouse_Over_Move_1_Teached {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://executeautomation.com/demosite/index.html?UserName=Rajkumar&Password=coolbuddy9&Login=Login");
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(20),TimeUnit.SECONDS);
		Actions a=new Actions(d);
		WebElement moveonmenu = d.findElement(By.xpath(".//*[@id='Automation Tools']"));
		a.moveToElement(moveonmenu).build().perform();
		
		Thread.sleep(3000);
		WebElement elem2 = d.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[2]/a"));
		a.moveToElement(elem2).build().perform();
		
		Thread.sleep(3000);
		WebElement elem3 = d.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[2]/ul/li[2]/a/span"));
		a.moveToElement(elem3).click().build().perform();
		
		
	}

}
