package _S_05_04_Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Link_Text_05_Sasi_Basic_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("wedriver.gecko.driver","C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver Firefox = new FirefoxDriver();
Firefox.get("https://www.leafground.com/link.xhtml");
Firefox.findElement(By.linkText("Go to Dashboard")).click();
	}

}
