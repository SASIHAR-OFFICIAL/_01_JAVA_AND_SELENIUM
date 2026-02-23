package _S_05_02_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Open_Browser_23_FireFox {

	public static void main(String[] args) {
		  FirefoxOptions options = new FirefoxOptions();
	        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

	        WebDriver d = new FirefoxDriver(options);
	   //     d.get("https://www.google.com");
	d.navigate().to("https://cityunionbank.bank.in/branches");
		

	}

}
