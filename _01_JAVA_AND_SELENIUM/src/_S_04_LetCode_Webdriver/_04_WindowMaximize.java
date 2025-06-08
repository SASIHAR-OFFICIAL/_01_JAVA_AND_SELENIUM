package _S_04_LetCode_Webdriver;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_WindowMaximize {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		//			driver.manage().window().maximize();

		driver
			.manage()
			.window()
			.maximize();
	}

}
