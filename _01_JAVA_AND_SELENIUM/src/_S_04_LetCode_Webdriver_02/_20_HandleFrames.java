package _S_04_LetCode_Webdriver_02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _20_HandleFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/frame");
		WebElement myFrame = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
//		driver.switchTo().frame(myFrame);
//		driver.findElementByName("fname").sendKeys("koushik");
//		driver.findElementByName("lname").sendKeys("C");
		driver.switchTo().frame(0).switchTo().frame(0);
		driver.findElement(By.name("email")).sendKeys("email");
//		driver.switchTo().parentFrame();
//		driver.findElementByName("lname").sendKeys("Chatterjee");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[text()=' Refer the video ']")).click();
	}

}
