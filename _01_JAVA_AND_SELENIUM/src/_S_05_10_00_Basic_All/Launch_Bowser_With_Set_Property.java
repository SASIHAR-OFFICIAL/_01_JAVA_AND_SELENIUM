package _S_05_10_00_Basic_All;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Bowser_With_Set_Property {

	public static void main(String[] args) {
		//System.setProperty("Webdriver.Gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		//System.setProperty("Webdriver.Chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
	}

}
