package _S_04_LetCode_Webdriver_02;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _12_02_LaunchFireFox {
	
	public static void main(String[] args) {
		// fox
		System.setProperty("webdriver.gecko.driver",
				"./drivers/geckodriver.exe" );
		FirefoxDriver driver = new FirefoxDriver();
		
	}

}
