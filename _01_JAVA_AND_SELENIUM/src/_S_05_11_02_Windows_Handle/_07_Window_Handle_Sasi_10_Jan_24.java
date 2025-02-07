package _S_05_11_02_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _07_Window_Handle_Sasi_10_Jan_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver d = new FirefoxDriver();
d.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
String Window_1 = d.getWindowHandle();

WebElement openwindow = d.findElement(By.id("openwindow"));
openwindow.click();
Set<String> All_Windows = d.getWindowHandles();

for (String Window_2 : All_Windows) {
	d.switchTo().window(Window_2);
	}
Thread.sleep(2000);
d.close();
d.switchTo().window(Window_1);

}

}
