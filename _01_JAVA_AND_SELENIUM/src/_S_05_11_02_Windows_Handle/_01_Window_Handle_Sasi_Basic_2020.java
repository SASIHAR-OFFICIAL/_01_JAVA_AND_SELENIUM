package _S_05_11_02_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _01_Window_Handle_Sasi_Basic_2020 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://www.leafground.com/pages/Window.html");
		String mainWindow = d.getWindowHandle();  // To assign first window opened by program
		//1.To open home page
		WebElement openHomePage = d.findElement(By.id("home"));
		openHomePage.click();
		Set<String> openHomePageWindows = d.getWindowHandles();
		for (String newWindowsOpened1 : openHomePageWindows) {
			d.switchTo().window(newWindowsOpened1);
		}

		//1a. Opening and closing Home page windows
		WebElement editBox = d.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/img"));
		Thread.sleep(1000);
		editBox.click();
		Thread.sleep(1000);
		d.close();
		Thread.sleep(1000);
		d.switchTo().window(mainWindow);

		//2. Find the number of opened windows
		WebElement openMultiWindowBox = d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		openMultiWindowBox.click();
		int winCount = d.getWindowHandles().size();
		System.out.println("The number of opened windows are "+winCount);

		//3.Close all except this window 
		WebElement doNotCloseThisWindow =d.findElement(By.id("color"));
		doNotCloseThisWindow.click();
		Thread.sleep(1000);
		Set<String> openedForDonClose = d.getWindowHandles();

		for (String newWindowsOpened2  : openedForDonClose) {
			if (!newWindowsOpened2.equals(mainWindow)) {
				d.switchTo().window(newWindowsOpened2);
				d.close();
				Thread.sleep(1000);
			}
		}
			d.quit();
	}
}
