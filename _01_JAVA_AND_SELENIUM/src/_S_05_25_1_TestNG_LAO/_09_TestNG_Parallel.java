package _S_05_25_1_TestNG_LAO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class _09_TestNG_Parallel {
	@Test
	public void Open_firefox() {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.amazon.in/");
	}
	
	@Test
	public void Open_Chrome() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
	}
}
