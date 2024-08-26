package _S_05_01_Webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class _04_Navigate_Browser_History {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		// Starts a new instance of Google Chrome 
				 
		// Open a webpage (method will return after the page is fully loaded) 
		driver.navigate().to("http://selenium.academy"); 
		 
		// Open a webpage (method will return after the page is fully loaded) 
		driver.navigate().to("http://google.com"); 
		 
		// Navigate back 
		driver.navigate().back(); 
		 
		// Navigate forward 
		driver.navigate().forward(); 
		 
		// Closes the running Google Chrome instance 
		driver.quit();
		
	}}
