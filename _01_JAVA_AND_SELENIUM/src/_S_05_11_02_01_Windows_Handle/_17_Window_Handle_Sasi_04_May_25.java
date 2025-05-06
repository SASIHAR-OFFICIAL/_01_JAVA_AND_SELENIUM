package _S_05_11_02_01_Windows_Handle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _17_Window_Handle_Sasi_04_May_25 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		FirefoxDriver d = new FirefoxDriver();
		d.navigate().to("https://letcode.in/window");
		String Parent_Window = d.getWindowHandle();

		WebElement Open_Home_Page = d.findElement(By.xpath("//*[text()='Open Home Page']"));
		Open_Home_Page.click();
		Set<String> Window_2 = d.getWindowHandles();

		String After_Click = d.getCurrentUrl();
		System.out.println("After_Click = "+After_Click);

		List<String> Window_2_list = new ArrayList<>(Window_2);
		int Window_2_size = Window_2_list.size();
		System.out.println("Window_2_size = "+Window_2_size);
		d.switchTo().window(Window_2_list.get(1));
		Thread.sleep(3000);
		String currentUrl = d.getCurrentUrl();
		System.out.println("currentUrl ="+currentUrl);
		d.switchTo().window(Window_2_list.get(0));
		Window_2_list.clear();

		WebElement Muiltiple_window = d.findElement(By.xpath("//*[text()='Muiltiple windows']"));
		Muiltiple_window.click();

		Set<String> windowHandles = d.getWindowHandles();

		int size = windowHandles.size();
		System.out.println("size ="+size);
		
		List<String> Multi_Win = new ArrayList<>();
		for (String string : windowHandles) {
			d.switchTo().window(string);
			String title = d.getTitle();
			System.out.println("title ="+title);
		}
	}	}
