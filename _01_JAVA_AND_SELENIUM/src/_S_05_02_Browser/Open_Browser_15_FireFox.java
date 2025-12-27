package _S_05_02_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Browser_15_FireFox {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://web.whatsapp.com/");

	}

}
