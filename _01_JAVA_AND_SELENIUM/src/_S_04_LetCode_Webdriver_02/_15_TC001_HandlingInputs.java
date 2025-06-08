package _S_04_LetCode_Webdriver_02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class _15_TC001_HandlingInputs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://letcode.in/edit");
		// Enter your full Name
		driver.findElement(By.id("fullName")).sendKeys("Koushik Chatterjee");

		// Append a text and press keyboard tab
		driver.findElement(By.id("join")).sendKeys(" person", Keys.TAB);
		
		// What is inside the text box
		String myValue = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(myValue);

		// Clear the text
		driver.findElement(By.id("clearMe")).clear();

		// Confirm edit field is disabled
		boolean isEdit = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(isEdit);

		// Confirm text is readonly
		String isReadOnly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(isReadOnly);
		
		// quit browser
		driver.quit();
	}

}
