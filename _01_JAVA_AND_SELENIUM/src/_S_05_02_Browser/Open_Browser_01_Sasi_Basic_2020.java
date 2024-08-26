package _S_05_02_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser_01_Sasi_Basic_2020 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.Driver", "C:\\WebDrivers\\chromedriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https:\\www.google.co.in");
		
		/*System.setProperty("webdriver.gecko.driver", "C:\WebDriver\geckodriver\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https:\\www.google.co.in");*/
		
	}

}
