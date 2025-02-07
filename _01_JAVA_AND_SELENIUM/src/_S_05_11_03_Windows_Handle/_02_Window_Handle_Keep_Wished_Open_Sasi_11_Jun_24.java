package _S_05_11_03_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _02_Window_Handle_Keep_Wished_Open_Sasi_11_Jun_24 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Wedriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		// Open multiple URLs
		d .get("https://www.etvbharat.com/ta/!state");
		Thread.sleep(1000);
		((FirefoxDriver ) d ).executeScript("window.open('https://google.com','_blank');");
		Thread.sleep(1000);
		((FirefoxDriver ) d ).executeScript("window.open('https://stackoverflow.com','_blank');");
		Thread.sleep(1000);
//Define the URL to keep open
		String urlToKeepOpen = "https://www.etvbharat.com/ta/!state";

// Get all window handles
		Set<String> All_3_windows = d .getWindowHandles();

// Find the window handle of the URL to keep open
		String windowHandleToKeepOpen = null;
		for (String All_windows : All_3_windows) {
			d .switchTo().window(All_windows);
			if (d .getCurrentUrl().equals(urlToKeepOpen)) {
				windowHandleToKeepOpen = All_windows;
				break;
			}}
// Close all other windows except the one to keep open
		for (String All_windows : All_3_windows) {
			if (!All_windows.equals(windowHandleToKeepOpen)) {
				d .switchTo().window(All_windows);
				Thread.sleep(2000);
				d .close();
			}}	
// Switch back to the window to keep open
//		if (windowHandleToKeepOpen != null) {
//			d .switchTo().window(windowHandleToKeepOpen);
//		}

// Perform any other actions on the remaining window
// Optional: Close the browser after all actions are done
//		Thread.sleep(2000);
//		d .quit();		
	}}
