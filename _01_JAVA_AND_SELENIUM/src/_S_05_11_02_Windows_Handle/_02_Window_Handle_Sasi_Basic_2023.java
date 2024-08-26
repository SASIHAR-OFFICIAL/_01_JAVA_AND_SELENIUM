package _S_05_11_02_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _02_Window_Handle_Sasi_Basic_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F =new FirefoxDriver();
		F.manage().window().maximize();
		F.get("https://www.leafground.com/window.xhtml");
		String Parent_window =F.getWindowHandle();

		//Open_box------------------------------------------------------------------
		WebElement Open_box =F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span"));
		Open_box.click();
		Set<String> Parent_and_Child= F.getWindowHandles();
		for (String Child0 : Parent_and_Child) {
			F.switchTo().window(Child0);
			Thread.sleep(1500);

		}
		F.close();
		//Open_Multiple_Box------------------------------------------------------------------
		F.switchTo().window(Parent_window);
		Thread.sleep(1500);
		WebElement Open_Multiple_Box = F.findElement(By.id("j_idt88:j_idt91"));
		Open_Multiple_Box.click();
		Set<String> Child1 =F.getWindowHandles();
		int Child_Windows_opened =Child1.size();
		System.out.println("Child_Windows_opened = "+Child_Windows_opened);
		F.switchTo().window(Parent_window);
		Thread.sleep(1500);

		//Close all ------------------------------------------------------------------

		WebElement Close_All = F.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		Close_All.click();
		Set<String> Child2 = F.getWindowHandles();
		for (String All_windows : Child2) {
			if (!All_windows.equals(Parent_window)) {
				F.switchTo().window(All_windows);
				Thread.sleep(1500);
				F.close();
				
			}
			
		}
		
	}

}
