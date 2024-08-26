package _S_05_02_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Open_Browser_07_Sasi_Basic_Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http:\\www.google.com");*/


System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver driverF = new FirefoxDriver();
driverF.get("http:\\www.google.com");

/*System.setProperty("webdriver.driver", "C:\\SELENIUM WEBDRIVER\\edgedriver_win64\\msedgedriver.exe");
WebDriver driverE = new EdgeDriver();
driverE.get("http:\\www.google.com");

System.setProperty("webdriver.opera.driver", "C:\\SELENIUM WEBDRIVER\\edgedriver_win64\\msedgedriver.exe");
WebDriver driverO = new OperaDriver(); 
driverO.get("http:\\www.google.com");*/

}

}
