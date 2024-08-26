package _S_05_04_Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Link_Text_10_Sasi_Dec_23 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver d = new FirefoxDriver();
d.navigate().to("http://astrology.tamilcube.com/tamil-astrology/tamil-horoscope.aspx");
Thread.sleep(3000);

WebElement Rasi_Palan = d.findElement(By.linkText("Rasi Palan"));
Rasi_Palan.click();
Thread.sleep(3000);

d.navigate().back();
WebElement calendar = d.findElement(By.partialLinkText("calendar"));
calendar.click();		
	}

}
