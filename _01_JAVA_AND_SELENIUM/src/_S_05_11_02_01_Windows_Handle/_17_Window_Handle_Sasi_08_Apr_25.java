package _S_05_11_02_01_Windows_Handle;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _17_Window_Handle_Sasi_08_Apr_25 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		FirefoxDriver d = new FirefoxDriver();
		d.navigate().to("https://letcode.in/window");
		String Parent_Window = d.getWindowHandle();
		WebElement Open_Home_Page = d.findElement(By.xpath("//*[text()='Open Home Page']"));
		Open_Home_Page.click();
		Set<String> Window_2 = d.getWindowHandles();
	List<String> Window_2_list = new ArrayList<>(Window_2);
	int Window_2_size = Window_2_list.size();
	System.out.println("Window_2_size = "+Window_2_size);
		d.switchTo().window(Window_2_list.get(0));
		String currentUrl = d.getCurrentUrl();
		System.out.println("currentUrl ="+currentUrl);
		
	}

}
