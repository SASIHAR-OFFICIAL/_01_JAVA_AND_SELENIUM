package _S_05_11_02_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _04_Window_Handle_Sasi_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F =new FirefoxDriver();
		F.manage().window().maximize();
		F.get("https://demoqa.com/browser-windows");
		String Parent_window =F.getWindowHandle();
		//New Tab------------------------------------------------------------
		WebElement New_Tab = F.findElement(By.xpath("//*[@id=\"tabButton\"]"));
		New_Tab.click();
		Thread.sleep(1500);
		Set<String> parent_and_Childs =  F.getWindowHandles();
		for (String Child_Windows1 : parent_and_Childs) {
			F.switchTo().window(Parent_window);

		}
		Thread.sleep(1500);


		//New windows----------------------------------------------------------
		WebElement New_Windows = F.findElement(By.xpath("//*[@id=\"windowButton\"]"));
		New_Windows.click();
		Set<String> parent_and_Childs2 =  F.getWindowHandles();
		for (String Child2 : parent_and_Childs2) {
			F.switchTo().window(Parent_window);			
		}
		Thread.sleep(1500);

		//New Window Message-------------------------------------------
		WebElement New_Window_Message = F.findElement(By.xpath("//*[@id=\"messageWindowButton\"]"));
		New_Window_Message.click();
		Set<String> parent_and_Childs3 = F.getWindowHandles();
		for (String Child3 : parent_and_Childs3) {
			F.switchTo().window(Parent_window);
		}
		for (String Child3 : parent_and_Childs3) {
			if (!Child3.equals(Parent_window)) {					 
				F.switchTo().window(Child3);
				Thread.sleep(1500);
				F.close();
			}
		}
		Thread.sleep(1500);
		F.quit();
	}
}


