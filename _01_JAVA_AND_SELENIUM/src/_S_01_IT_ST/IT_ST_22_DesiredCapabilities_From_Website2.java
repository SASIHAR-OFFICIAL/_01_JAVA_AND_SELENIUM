package _S_01_IT_ST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;

public class IT_ST_22_DesiredCapabilities_From_Website2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//it is used to define IE capability 
		InternetExplorerOptions browserOptions = new InternetExplorerOptions();
		// DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		  
		browserOptions.setCapability(CapabilityType.BROWSER_NAME, "IE");
		browserOptions.setCapability(InternetExplorerDriver.
		  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);


		System.setProperty("webdriver.ie.driver", "C:\\WebDriver\\IEDriver\\IEDriverServer.exe");
		  
		 //it is used to initialize the IE driver
		 WebDriver driver = new InternetExplorerDriver(browserOptions);
		  
		 driver.manage().window().maximize();

		 driver.get("http://gmail.com");
		  
		 driver.quit();
		 }
		  
		}