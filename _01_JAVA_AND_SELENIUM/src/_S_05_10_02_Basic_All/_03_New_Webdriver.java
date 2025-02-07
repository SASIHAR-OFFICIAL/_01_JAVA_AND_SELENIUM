package _S_05_10_02_Basic_All;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _03_New_Webdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		// OPEN GOOGLE IN FIRST WINDOW
		//d.navigate().to("https://www.google.com/webhp");
		String First_window = d.getWindowHandle();

		//INSTALL ADBLOCK PLUS

		Path Path_for_Adblock = Paths.get("C:\\WebDriver\\geckodriver\\adblock_plus-4.0.xpi");
		String ExtensionID = d.installExtension(Path_for_Adblock);
		Thread.sleep(5000);

		// CLOSE SECOND WINDOW

		Set<String> Second_Window = d.getWindowHandles();  // Name the String All_2_window it includes First_window & Second_Window
		for (String All_2_window : Second_Window) {
			d.switchTo().window(All_2_window);		// Switch Drive d to All_2_window
			if (!All_2_window.equals(First_window)) {  // The Windows which are all in All_2_window not equals First_window it will be closed
				d.close();
			}
			//d.uninstallExtension(ExtensionID);
		}
	}
}
