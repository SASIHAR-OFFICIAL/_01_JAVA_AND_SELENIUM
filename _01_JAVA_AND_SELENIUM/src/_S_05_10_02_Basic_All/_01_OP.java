package _S_05_10_02_Basic_All;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _01_OP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("WEBDRIVER.GECKO.DRIVER", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver d = new FirefoxDriver();
d.manage().window().maximize();
d.navigate().to("https://theekkathir.in/");
Thread.sleep(3000);
d.quit();
	}

}
