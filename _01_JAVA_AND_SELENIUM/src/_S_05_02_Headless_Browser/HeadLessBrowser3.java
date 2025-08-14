0package _S_05_02_Headless_Browser;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessBrowser3 {

	
		public static void main(String[] args) {
	        HtmlUnitDriver driver = new HtmlUnitDriver(true); // enable JS

	        driver.getBrowserVersion().setUserAgent(
	            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128 Safari/537.36"
	        );

	        driver.get("https://www.google.co.in");
	        System.out.println("Title = " + driver.getTitle());

	        driver.quit();
	    }
	}