package _S_04_LetCode_Webdriver_02;

import org.openqa.selenium.chrome.ChromeDriver;

public class _12_01_LaunchChrome {
	
	public static void main(String[] args) {
		// chrome
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe" );
		ChromeDriver driver = new ChromeDriver();
		
	}

}
