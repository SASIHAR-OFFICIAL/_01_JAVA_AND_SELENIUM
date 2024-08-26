package _S_05_01_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _Webdriver {

	public static void main(String[] args) {

		System.setProperty("Webdriver.chrome.Driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriver chromeDriver = new ChromeDriver();
		driver.quit();

		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		//WebDriver firefoxDriver = new FirefoxDriver();
		driver1.quit();

		//WebDriver ieDriver = new InternetExplorerDriver();
		//ieDriver.quit();

		System.setProperty("Webdriver.edge.Driver", "C:\\WebDriver\\edgedriver\\msedgedriver.exe");
		WebDriver driver2 = new EdgeDriver();
		driver2.manage().window().maximize();
		//WebDriver edgeDriver = new EdgeDriver();
		driver2.quit();

	}
}