package _S_05_11_03_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _03_Window_Handle_Keep_Wished_OpenSasi_12_Jun_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Wedriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		// Open multiple URLs
		d.navigate().to("https://www.etvbharat.com/ta/!state");
		d.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(1000);
		d.navigate().to("https://google.com");
		d.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(1000);		
		d.navigate().to("https://stackoverflow.com");
		Thread.sleep(1000);

		// URL To Keep Open
		String urlToKeepOpen= "https://www.etvbharat.com/ta/!state";

		// Get all window handles
		Set<String> All_3_Windows = d.getWindowHandles();

		// Find the window handle of the URL to keep open
		String TAB_ToKeepOpen = null;
		for (String All_Windows : All_3_Windows) {
			d.switchTo().window(All_Windows);
			if (d.getCurrentUrl().equals(urlToKeepOpen)) {
				TAB_ToKeepOpen = All_Windows;
				break;
			}}

		// Close all other windows except the one to keep open
		for (String All_Windows : All_3_Windows) {
			if (!All_Windows.equals(TAB_ToKeepOpen)) {
				d.switchTo().window(All_Windows);
				Thread.sleep(1000);
				d.close();
			}}}}