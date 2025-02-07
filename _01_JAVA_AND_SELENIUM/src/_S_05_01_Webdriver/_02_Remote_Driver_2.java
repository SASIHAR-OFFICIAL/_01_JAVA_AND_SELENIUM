package _S_05_01_Webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class _02_Remote_Driver_2 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
//		System.setProperty("Webdriver.Gecko.Driver","C:\\WebDriver\\geckodriver\\geckodriver.exe" );  
//		WebDriver d = new FirefoxDriver();
		URL gridUrl = new URL("https://www.google.com/");
		 
		// You can select another browser by changing the DesiredCapabilities
		//Capabilities capabilities = DesiredCapabilities.firefox();
		FirefoxOptions browserOptions = new FirefoxOptions();
		 
		// Launches a new Firefox instance on the TestGrid server
		WebDriver driver = new RemoteWebDriver(gridUrl, browserOptions);
		 
		// Closes the remote browser
		 
		driver.quit();

	}

}
