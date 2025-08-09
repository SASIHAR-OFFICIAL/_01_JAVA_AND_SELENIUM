package _S_05_29_DataDriven_JXL_TestNG_EXCEL;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class del_09_Aug {

	public static void main(String[] args) {
		System.setProperty("Webdriver.Chrome.Driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		//Start a new instance of Google Chrome
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().to("https://www.google.com");

	}

}
