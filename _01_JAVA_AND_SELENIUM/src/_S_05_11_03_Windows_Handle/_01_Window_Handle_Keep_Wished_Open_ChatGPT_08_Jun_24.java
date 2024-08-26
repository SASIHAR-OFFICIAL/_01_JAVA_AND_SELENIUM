package _S_05_11_03_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _01_Window_Handle_Keep_Wished_Open_ChatGPT_08_Jun_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		// Open multiple URLs
		d .get("https://www.etvbharat.com/ta/!state");
		Thread.sleep(1000);
		((ChromeDriver ) d ).executeScript("window.open('https://google.com','_blank');");
		Thread.sleep(1000);
		((ChromeDriver ) d ).executeScript("window.open('https://stackoverflow.com','_blank');");
		Thread.sleep(1000);

		// Define the URL to keep open
		String urlToKeepOpen = "https://www.etvbharat.com/ta/!state";

		// Get all window handles
		Set<String> allWindowHandles = d .getWindowHandles();

		// Find the window handle of the URL to keep open
		String windowHandleToKeepOpen = null;
		for (String handle : allWindowHandles) {
			d .switchTo().window(handle);
			if (d .getCurrentUrl().equals(urlToKeepOpen)) {
				windowHandleToKeepOpen = handle;
				break;
			}}

		// Close all other windows except the one to keep open
		for (String handle : allWindowHandles) {
			if (!handle.equals(windowHandleToKeepOpen)) {
				d .switchTo().window(handle);
				Thread.sleep(2000);
				d .close();
			}}

		// Switch back to the window to keep open
		if (windowHandleToKeepOpen != null) {
			d .switchTo().window(windowHandleToKeepOpen);
		}

		// Perform any other actions on the remaining window
		// ...

		// Optional: Close the browser after all actions are done
		// d .quit();
	}}


