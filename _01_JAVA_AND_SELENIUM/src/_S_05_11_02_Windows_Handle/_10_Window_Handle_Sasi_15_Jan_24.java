package _S_05_11_02_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _10_Window_Handle_Sasi_15_Jan_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");

		String Main_Windows = d.getWindowHandle();

		WebElement Twitter  = d.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div[1]/div/div[1]/a"));
		Twitter.click();
		Set<String> Secondary_1 = d.getWindowHandles();

		for (String Twitter_Window : Secondary_1) {
			d.switchTo().window(Twitter_Window);
		}
		int Twitter_Window_size = Secondary_1.size();
		System.out.println("Twitter_Window_size = "+Twitter_Window_size);
		Thread.sleep(3000);
		d.close();
		d.switchTo().window(Main_Windows);

		WebElement Facebook = d.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[1]/div/div[2]/a"));
		Facebook.click();
		Set<String> Secondary_2 = d.getWindowHandles();
		for (String facebook2_windo : Secondary_2) {

		}

		int FaceBook_size = Secondary_2.size();

	}

}
