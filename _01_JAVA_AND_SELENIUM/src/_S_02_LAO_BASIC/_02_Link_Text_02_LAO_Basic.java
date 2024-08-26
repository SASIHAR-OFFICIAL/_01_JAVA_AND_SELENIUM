package _S_02_LAO_BASIC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _02_Link_Text_02_LAO_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.geko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver F = new FirefoxDriver();
F.get("https://www.careinsurance.com/");
F.findElement(By.xpath("/html/body/section[2]/header/div[2]/div/div[2]/div[2]/div[2]/div/ul/li[1]/a")).click();
	}

}
