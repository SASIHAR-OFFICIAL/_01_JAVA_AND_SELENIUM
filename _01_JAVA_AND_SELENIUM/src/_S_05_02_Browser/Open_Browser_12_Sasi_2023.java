package _S_05_02_Browser;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Browser_12_Sasi_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver d = new FirefoxDriver();
d.navigate().to("https://www.google.com");
WebElement Search_Area = d.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
Search_Area.sendKeys("Coimbatore"+Keys.ENTER);
	}

}
