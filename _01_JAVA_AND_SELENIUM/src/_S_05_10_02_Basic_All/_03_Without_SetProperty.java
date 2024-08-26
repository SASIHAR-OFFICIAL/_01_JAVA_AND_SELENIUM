package _S_05_10_02_Basic_All;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Without_SetProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//WebDriver d = new FirefoxDriver();

WebDriver d = new ChromeDriver();
d.navigate().to("https://www.google.com/webhp");
	}

}
