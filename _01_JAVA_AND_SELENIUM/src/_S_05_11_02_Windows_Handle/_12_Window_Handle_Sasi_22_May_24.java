package _S_05_11_02_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class _12_Window_Handle_Sasi_22_May_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver d =new FirefoxDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.google.com/webhp");
		String Window_1 = d.getWindowHandle();
		Thread.sleep(1000);

		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://www.tamildailycalendar.com/tamil_daily_calendar.php");
		Set<String> Window_1_And_2 = d.getWindowHandles();
		Thread.sleep(1000);

		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://liteapks.com");

		Set<String> Window_1_2_And_3 = d.getWindowHandles();
		Thread.sleep(1000);

		for (String All_3_Windo : Window_1_2_And_3) {
			if (!All_3_Windo.contains("https://liteapks.com")) {
				d.switchTo().window(All_3_Windo);
				Thread.sleep(1000);
				d.close();
			}
		}
	}
}
