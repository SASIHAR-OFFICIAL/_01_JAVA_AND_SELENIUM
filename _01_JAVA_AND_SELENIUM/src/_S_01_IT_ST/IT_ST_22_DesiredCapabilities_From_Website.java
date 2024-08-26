package _S_01_IT_ST;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class IT_ST_22_DesiredCapabilities_From_Website {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System Property for Gecko Driver   
		System.setProperty("Webdriver.Gecko.Driver","C:\\WebDriver\\geckodriver\\geckodriver.exe" );  
		          
		          // Initialize Gecko Driver using Desired Capabilities Class  
		
		   // DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
		    FirefoxOptions browserOptions = new FirefoxOptions();
		    browserOptions.setCapability("marionette",true);  

		    WebDriver driver= new FirefoxDriver(browserOptions);  
		          
		         // Launch Website  
		    driver.navigate().to("http://www.javatpoint.com/");  
		          
		        // Click on the Custom Search text box and send value  
		    driver.findElement(By.id("gsc-i-id1")).sendKeys("Java");  
		          
		        // Click on the Search button  
		driver.findElement(By.className("gsc-search-button gsc-search-buttonv2")).click();    
		        }  		  
		}
