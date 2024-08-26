package _S_05_01_Webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class _02_Remote_Driver_1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		// Add a reference to the Selenium client jar from
		// http://www.seleniumhq.com
		
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://TestGrid:4444/wd/hub");
		URL gridUrl = new URL("http://TestGrid:4444/wd/hub");
		
		// delete down
//		FirefoxProfile firefoxProfile = new FirefoxProfile();
//		firefoxProfile.setPreference("enableNativeEvents", true);
//
//		FirefoxOptions options = new FirefoxOptions();
//		options.setBinary(browserBinary);
//		options.toCapabilities();
		//delete up
		
		// You can select another browser by changing the DesiredCapabilities
		FirefoxOptions browserOptions  = new FirefoxOptions();
		//Capabilities capabilities = DesiredCapabilities.firefox();
		 
		// Launches a new Firefox instance on the TestGrid server
		WebDriver driver2 = new RemoteWebDriver(gridUrl, browserOptions);
		 
		// Closes the remote browser
		 
		driver.quit();
	}

}
