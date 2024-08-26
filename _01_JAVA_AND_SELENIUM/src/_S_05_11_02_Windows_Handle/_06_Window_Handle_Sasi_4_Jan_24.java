package _S_05_11_02_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _06_Window_Handle_Sasi_4_Jan_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.gecko.diver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		String First_Window = d.getWindowHandle();
		d.navigate().to("https://www.leafground.com/window.xhtml");

		WebElement Open_Box = d.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span"));
		Open_Box.click();

		Set<String> All_Windows = d.getWindowHandles();

		for (String Second_Window : All_Windows) {
			d.switchTo().window(Second_Window);
		}
		Thread.sleep(1000);
		d.close();

		d.switchTo().window(First_Window);

		WebElement Open_Multiple = d.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/button/span"));
		Open_Multiple.click();
		Set<String> Open_Multiple2 = d.getWindowHandles();

		int Open_Multiple_size = Open_Multiple2.size();
		System.out.println("Open_Multiple_size = "+Open_Multiple_size);

		d.switchTo().window(First_Window);

		WebElement Close_Window = d.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/button/span[2]"));
		Close_Window.click();

		Set<String> Close_All_Window = d.getWindowHandles();
		int Close_All_Window_size = Close_All_Window.size();
		System.out.println("After Clicking Close Windows = "+Close_All_Window_size);


		for (String All_Opened_windows : Close_All_Window) {
			if (!All_Opened_windows.equals(First_Window)) {
				d.switchTo().window(All_Opened_windows);
			}
			Thread.sleep(1000);
			d.close();
		}
		d.switchTo().window(First_Window);
		Thread.sleep(1000);
		d.quit();
	}

}

