package _S_04_LetCode_Webdriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class _18_Print {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://letcode.in/");
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

}
