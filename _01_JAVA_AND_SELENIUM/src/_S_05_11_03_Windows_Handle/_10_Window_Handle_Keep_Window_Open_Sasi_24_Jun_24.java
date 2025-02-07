package _S_05_11_03_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _10_Window_Handle_Keep_Window_Open_Sasi_24_Jun_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();

		d.navigate().to("https://x.com/");
		String windowHandle_1 = d.getWindowHandle();
		d.switchTo().newWindow(WindowType.WINDOW);
		d.navigate().to("https://www.facebook.com");
		Set<String> windowHandles_2 = d.getWindowHandles();
		d.switchTo().newWindow(WindowType.WINDOW);
		d.navigate().to("https://www.instagram.com/");
		Set<String> windowHandles_3 = d.getWindowHandles();
		d.switchTo().newWindow(WindowType.WINDOW);
		d.navigate().to("https://www.youtube.com/");
		Set<String> windowHandles_4 = d.getWindowHandles();
		
		for (String All_Windows : windowHandles_4) {
			d.switchTo().window(All_Windows);
			if (!windowHandle_1.equals(All_Windows)) {
				Thread.sleep(1000);
				d.close();				
			}}}}	
		
