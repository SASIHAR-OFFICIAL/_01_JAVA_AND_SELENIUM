package _S_04_LetCode_Webdriver_02;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _32_InteractWithActiveElement {

	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		WebElement activeElement = driver.switchTo().activeElement();
		activeElement.sendKeys("email",
				Keys.TAB,
				"Password",
				Keys.ENTER);

	}
}
