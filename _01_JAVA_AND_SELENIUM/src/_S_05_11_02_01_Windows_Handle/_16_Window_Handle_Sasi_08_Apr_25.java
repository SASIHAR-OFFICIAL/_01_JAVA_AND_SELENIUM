package _S_05_11_02_01_Windows_Handle;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class _16_Window_Handle_Sasi_08_Apr_25 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver d = new FirefoxDriver();
		//d.manage().window().maximize();
		
		String First_window = d.getWindowHandle();

		//INSTALL ADBLOCK PLUS

		//Path Path_for_Adblock = Paths.get("C:\\WebDriver\\geckodriver\\adblock_plus-4.0.xpi");
		Path Path_for_Adblock = Paths.get("C:\\WebDriver\\Adblock\\adblock_plus-4.18.0.xpi");
		String ExtensionID = d.installExtension(Path_for_Adblock);
		Thread.sleep(5000);

		// CLOSE SECOND WINDOW

//		Set<String> Second_Window = d.getWindowHandles();  // Name the String All_2_window it includes First_window & Second_Window
//		for (String All_2_window : Second_Window) {
//			d.switchTo().window(All_2_window);		// Switch Drive d to All_2_window
//			if (!All_2_window.equals(First_window)) {  // The Windows which are all in All_2_window not equals First_window it will be closed
//				d.close();
//			}
			//d.uninstallExtension(ExtensionID);
			d.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
			System.out.println("MAINPAGE");
			Set<String> MainPage = d.getWindowHandles();
			
			WebElement Open_New_Window = d.findElement(By.xpath("//*[@id=\"newWindowBtn\"]"));
			Open_New_Window.click();
			System.out.println("NEW WINDOW");
			
			d.switchTo().window(First_window);
			//Thread.sleep(3000);

			WebElement Open_new_Tab = d.findElement(By.xpath("//*[@id=\"newTabBtn\"]"));

			Set<String> new_Window_2 = d.getWindowHandles();
			Open_new_Tab.click();
			System.out.println("NEW TAB");
			d.switchTo().window(First_window);
			//Thread.sleep(3000);

			WebElement Open_Multi_Window = d.findElement(By.xpath("//*[@id=\"newWindowsBtn\"]"));
			Set<String> new_Window_3 = d.getWindowHandles();
			Open_Multi_Window.click();
			System.out.println("Open_Multi_Window");
			d.switchTo().window(First_window);
			//Thread.sleep(3000);

			WebElement Open_Multi_Tabs = d.findElement(By.xpath("//*[@id=\"newTabsBtn\"]"));
			Set<String> new_Window_4 = d.getWindowHandles();
			Open_Multi_Tabs.click();
			System.out.println("Open_Multi_Tab");
			d.switchTo().window(First_window);
			//Thread.sleep(3000);

			WebElement Open_multi_Tab_and_Win = d.findElement(By.xpath("//*[@id=\"newTabsWindowsBtn\"]"));
			Set<String> new_Window_5 = d.getWindowHandles();
			Open_multi_Tab_and_Win.click();
			System.out.println("5 Open_multi_Tab_and_Win");

			d.switchTo().window(First_window);
			System.out.println("after 5 tabs opens main page");
			//Thread.sleep(10000);
						
			for (String AllWindows : new_Window_5) {
				if (AllWindows.equals(First_window)) {
					Thread.sleep(3000);
					d.close();
				}
				Thread.sleep(3000);
				d.quit();
			}

		}}	
