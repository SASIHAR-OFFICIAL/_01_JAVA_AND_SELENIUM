package _S_04_LetCode_Webdriver_02;

import org.openqa.selenium.chrome.ChromeDriver;

public class _30_ManageDriver {

	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in");
		driver.quit();
	}
}
