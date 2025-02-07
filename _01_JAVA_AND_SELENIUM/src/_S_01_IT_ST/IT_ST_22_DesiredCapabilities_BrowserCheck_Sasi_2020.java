package _S_01_IT_ST;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class IT_ST_22_DesiredCapabilities_BrowserCheck_Sasi_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "C:\WebDriver\chromedriver\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.co.in");
		System.setProperty("webdriver.ie.driver", "C:\WebDriver\IEDriver\IEDriverServer.exe");
		d1.get("https://www.google.co.in");*/
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		File pathBinary = new File("D:\\Program Files\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
		FirefoxOptions browserOptions = new FirefoxOptions();
		//DesiredCapabilities desired = DesiredCapabilities.firefox();
		FirefoxOptions options = new FirefoxOptions();
		browserOptions.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://www.google.co.in");
	
	}

}
