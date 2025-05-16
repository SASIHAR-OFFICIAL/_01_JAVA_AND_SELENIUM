package _S_05_11_02_04_Already_Opened_Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Already_Opened {

	public static void main(String[] args) {
		
		//"C:\Program Files\Google\Chrome\Application\chrome.exe" --remote-debugging-port=3333 --user-data-dir="D:\TEST"
		
		ChromeOptions ChromeOptions_Obj = new ChromeOptions();
		ChromeOptions_Obj.setExperimentalOption("debuggerAddress", "localhost:3333");

		ChromeDriver driver = new ChromeDriver(ChromeOptions_Obj);
		WebElement Email = driver.findElement(By.xpath("//input[@aria-label='Email or phone number']"));
		Email.sendKeys("Facebook@Facebook.com");
		
		WebElement Pass = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div"));
		Pass.sendKeys("Facebook@Facebook.com");
	}

}
