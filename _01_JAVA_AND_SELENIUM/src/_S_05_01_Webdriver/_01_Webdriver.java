package _S_05_01_Webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _01_Webdriver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
//Start a new instance of Google Chrome
WebDriver chromeDriver = new ChromeDriver();

//close the Chrome instance
chromeDriver.quit();

System.setProperty("webdriver.geko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
//Start a new instance of Firefox
WebDriver firefoxDriver = new FirefoxDriver();

//close the Firefox instance
firefoxDriver.quit();

/*/ Start a new instance of Internet Explorer
WebDriver ieDriver = new InternetExplorerDriver();
 
// close the Internet Explorer instance
ieDriver.quit();
 
// Start a new instance of Microsoft Edge
WebDriver edgeDriver = new EdgeDriver();
 
// close the instance of Microsoft Edge
edgeDriver.quit();
 
// Start a new instance of Safari
WebDriver safariDriver = new SafariDriver();
 
// close the instance of Safari
safariDriver.quit();    */

	
	}

}
