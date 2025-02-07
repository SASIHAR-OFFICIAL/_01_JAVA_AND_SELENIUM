package _S_05_11_02_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _05_Window_Handle_Sasi_2023 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver();
		F.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

		//Button1----------------------------------------------------
		WebElement Button1 = F.findElement(By.xpath("//*[@id=\"newWindowBtn\"]"));
		Button1.click();
		String Parent_Window = F.getWindowHandle();
		Thread.sleep(1500);
		F.switchTo().window(Parent_Window);

		//Button2----------------------------------------------------
		WebElement Button2 = F.findElement(By.xpath("//*[@id=\"newTabBtn\"]"));
		Button2.click();
		Set<String> Parent_and_Child2  = F.getWindowHandles();
		for (String Child2 : Parent_and_Child2) {
			Thread.sleep(1500);
			F.switchTo().window(Parent_Window);
		}
		//Button3----------------------------------------------------
		WebElement Button3 = F.findElement(By.xpath("//*[@id=\"newWindowsBtn\"]"));
		Button3.click();
		Set<String> Parent_and_Child3  = F.getWindowHandles();
		for (String Child3 : Parent_and_Child3) {
			Thread.sleep(1500);
			F.switchTo().window(Parent_Window);
		}
		//Button4----------------------------------------------------
		WebElement Button4 = F.findElement(By.xpath("//*[@id=\"newTabsBtn\"]"));
		Button4.click();
		Set<String> Parent_and_Child4  = F.getWindowHandles();
		for (String Child4 : Parent_and_Child4) {
			Thread.sleep(1500);
			F.switchTo().window(Parent_Window);
		}
		//Button5----------------------------------------------------
		WebElement Button5 = F.findElement(By.xpath("//*[@id=\"newTabsWindowsBtn\"]"));
		Button5.click();
		Set<String> Parent_and_Child5  = F.getWindowHandles();
		for (String Child5 : Parent_and_Child5) {
			Thread.sleep(1500);
			F.switchTo().window(Parent_Window);
		}
		//To Close All Windows ---------------------------------------------------------------- 
		for (String All_Windows : Parent_and_Child5) {
			if (!All_Windows.equals(Parent_Window)) {
				Thread.sleep(1500);
				F.close();
			}
					}
		F.switchTo().window(Parent_Window);
		F.quit();
	}
}