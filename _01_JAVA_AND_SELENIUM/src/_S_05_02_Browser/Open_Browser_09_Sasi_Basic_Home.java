package _S_05_02_Browser;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;

public class Open_Browser_09_Sasi_Basic_Home {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("asdf");
		//Keys.ENTER;
		//d.get("https://www.google.com/search?q="+SEARCH QUERY)
//		Thread.sleep(3000);
//		Keys f6 = Keys.F6;
//		Thread.sleep(3000);
//		Keys enter = Keys.ENTER;
	}

	
}
