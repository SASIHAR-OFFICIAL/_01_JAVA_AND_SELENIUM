package _S_05_02_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Browser_10_Enter_Data_Sasi_Basic_Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver Firefox =new FirefoxDriver();
		Firefox.get("https://www.google.com/");
		Firefox.findElement(By.name("q")).sendKeys("idm"+Keys.ENTER);
		

	}

}
