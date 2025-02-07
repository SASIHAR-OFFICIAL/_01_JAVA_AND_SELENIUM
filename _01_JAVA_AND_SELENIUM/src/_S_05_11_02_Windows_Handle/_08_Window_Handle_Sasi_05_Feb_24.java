package _S_05_11_02_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _08_Window_Handle_Sasi_05_Feb_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.gecko.diver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://demoqa.com/browser-windows");

		String New_Tab_window = d.getWindowHandle();
		WebElement New_Tab = d.findElement(By.id("tabButton"));
		New_Tab.click();
		Set<String> windowHandles_1 = d.getWindowHandles();
		for (String All_window_1 : windowHandles_1) {
			d.switchTo().window(All_window_1);
		}
		Thread.sleep(1500);
		d.close();
		d.switchTo().window(New_Tab_window);

		WebElement New_Window = d.findElement(By.id("windowButton"));
		New_Window.click();

		Set<String> windowHandles_2 = d.getWindowHandles();
		for (String All_window_2 : windowHandles_2) {
			d.switchTo().window(All_window_2);
		}
		Thread.sleep(1500);
		d.close();
		d.switchTo().window(New_Tab_window);


		WebElement New_window_message = d.findElement(By.id("messageWindowButton"));
		New_window_message.click();
		Set<String> windowHandles_3 = d.getWindowHandles();
		for (String All_windows_3 : windowHandles_3) {
			d.switchTo().window(All_windows_3);
		}
		Thread.sleep(1500);
		d.close();
		d.switchTo().window(New_Tab_window);

		Thread.sleep(1500);
		d.quit();


	}

}
