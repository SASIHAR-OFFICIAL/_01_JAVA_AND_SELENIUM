package _S_04_LetCode_Webdriver_02;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _28_GetTextAndGetAtrribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// get text
		WebElement header = driver.findElement(By.tagName("h1"));
		String text = header.getText();
//		System.out.println(text);
		
		String text2 = driver.findElement(By.linkText("Sign up")).getText();
//		System.out.println("Link: "+text2);
		
		
		String cardContent = driver.findElement(By.className("card-content")).getText();
//		System.out.println(cardContent);
		
		
		
		// get attribute
		
		String attribute = driver.findElement(By.id("join")).getAttribute("value");
		System.out.println(attribute);
		
		String attribute2 = driver.findElement(By.id("join")).getAttribute("id");
		System.out.println(attribute2);
		
		String attribute3 = driver.findElement(By.id("fullName")).getAttribute("placeholder");
		System.out.println(attribute3);

		driver.quit();
	}
}
