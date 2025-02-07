package _S_05_11_02_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _14_Window_Handle_Sasi_06_Jun_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();

		d.navigate().to("https://www.bbc.com/tamil");
		String First_Window = d.getWindowHandle();

		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://tamil.oneindia.com/");
		Set<String> Two_windows = d.getWindowHandles();

		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://tamil.webdunia.com/");
		Set<String> Three_windows = d.getWindowHandles();

		d.switchTo().newWindow(WindowType.TAB);
			
		d.navigate().to("https://www.etvbharat.com/ta/!state");
		String currentUrl = d.getCurrentUrl();
		System.out.println("URL= "+currentUrl);
		Set<String> Four_windows = d.getWindowHandles();
		

		// For Closing all Windows, Expect First BBC Window

//				for (String All_Windows : Four_windows) {
//					if (!First_Window.equals(All_Windows)) {
//						d.switchTo().window(All_Windows);
//						Thread.sleep(2000);
//						d.close();
//						}
//					}

		// For Closing all Windows, Expect etvbharat Window

//		for (String All_windows : Four_windows) {
//			
//			if (!currentUrl.equals(All_windows)) {
//				d.switchTo().window(All_windows);
//				Thread.sleep(2000);
//				d.close();
//			}
//		}
		for (String All_windows : Four_windows) {
			if (!currentUrl.equals(Four_windows)) {
				d.switchTo().window(All_windows);
				Thread.sleep(2000);
				d.close();
				
			}
			
		}
		
	}
}


