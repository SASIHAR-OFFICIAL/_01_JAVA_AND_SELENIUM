package _S_04_Parthasarathy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserCheck_Parthasarthy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.co.in");*/
		/*System.setProperty("webdriver.ie.driver", "C:\\WebDriver\\IEDriver\\IEDriverServer.exee");
		WebDriver d= new FirefoxDriver();
		d.get("https://www.google.co.in");*/
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--private"); 
		//BELLOW ERROR
		//DesiredCapabilities capabilities= DesiredCapabilities.firefox();
		//BELLOW ERROR
		//capabilities.setCapability("marionette", true);
		WebDriver d=new FirefoxDriver();
		d.get("https://www.google.co.in");
	

	}

}
