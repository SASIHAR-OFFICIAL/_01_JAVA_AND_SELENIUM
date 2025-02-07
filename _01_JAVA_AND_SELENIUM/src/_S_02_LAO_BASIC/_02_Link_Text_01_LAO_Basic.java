package _S_02_LAO_BASIC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _02_Link_Text_01_LAO_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver F = new FirefoxDriver();
F.get("https://www.leafground.com/link.xhtml");
F.findElement(By.linkText("Go to Dashboard")).click();
	}

}
