package _S_05_11_02_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _13_Window_Handle_Sasi_24_May_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();

		d.navigate().to("https://www.google.com/webhp");
		String First_Win = d.getWindowHandle();
		Thread.sleep(1000);
		WebElement Gmail = d.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/a"));
		Gmail.click();
		Thread.sleep(1000);
		d.navigate().back();
		Thread.sleep(1000);
		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://mail.google.com/");
		Set<String> First_Second_Win = d.getWindowHandles();
		Thread.sleep(1000);
		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://www.bing.com/");
		Set<String> First_Second_Third_Win = d.getWindowHandles();
		for (String All_3_Windows : First_Second_Third_Win) {
		if (!All_3_Windows.equals(First_Win)) {
			d.switchTo().window(All_3_Windows);
			d.close();
			
		}

		}
	}
}
