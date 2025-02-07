package _S_05_02_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Browser_08_Enter_Data_Sasi_Basic_Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
WebDriver Chrome = new ChromeDriver();
Chrome.get("http://www.bing.com");*/

System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver Firefox = new FirefoxDriver();
Firefox.get("https://www.google.com");
Firefox.findElement(By.name("q")).sendKeys("Kovai"+Keys.ENTER);
	}

}
