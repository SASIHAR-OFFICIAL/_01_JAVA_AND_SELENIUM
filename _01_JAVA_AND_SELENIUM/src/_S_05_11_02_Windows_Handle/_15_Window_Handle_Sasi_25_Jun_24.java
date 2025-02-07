package _S_05_11_02_Windows_Handle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _15_Window_Handle_Sasi_25_Jun_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://letcode.in/windows");
		String Window_1 = d.getWindowHandle();
		
		WebElement Home_page = d.findElement(By.xpath("//*[@id=\"home\"]"));
		Home_page.click();
		Thread.sleep(1000);
		
		Set<String> Windows_2 = d.getWindowHandles();
		List<String> Win_list = new ArrayList<String>(Windows_2);
		d.switchTo().window(Win_list.get(1));
		String Windows_2_title = d.getTitle();
		String Windows_2_Url = d.getCurrentUrl();
		System.out.println("Windows_2_title = "+Windows_2_title);
		System.out.println("Windows_2_Url = "+Windows_2_Url);
		

		}}
