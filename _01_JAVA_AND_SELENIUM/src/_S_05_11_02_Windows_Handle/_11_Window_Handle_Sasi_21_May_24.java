package _S_05_11_02_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _11_Window_Handle_Sasi_21_May_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();

		d.navigate().to("https://www.google.com");
		String First_window = d.getWindowHandle();
		Thread.sleep(1000);

		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://www.yahoomail.com");
		Set<String> First_Second = d.getWindowHandles();
		Thread.sleep(1000);

		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://www.gmail.com");
		Set<String> First_second_Third = d.getWindowHandles();
		Thread.sleep(1000);


		// string name and driver name is All_3_Windows
		// In if loop All_3_Windows check with first window and close others
		for (String All_3_Windows : First_second_Third) {

			if (!All_3_Windows.equals(First_window)) {
				d.switchTo().window(All_3_Windows);
				d.close();				
			}

		}
	}
}
