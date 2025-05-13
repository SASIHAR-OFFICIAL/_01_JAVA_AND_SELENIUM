package _S_05_11_02_01_Windows_Handle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _18_Window_Handle_Get_Tilte_iterator_Sasi_12_May_25 {

	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();

		driver.navigate().to("https://www.google.co.in/");
		String Win_1 = driver.getWindowHandle();

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.bbc.com/tamil");


		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://tamil.oneindia.com/");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://tamil.webdunia.com/");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://m.dailyhunt.in/news/india/tamil");

		driver.switchTo().window(Win_1);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.bbc.com/");

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.thehindu.com/");

		Set<String> All_windowHandles = driver.getWindowHandles();
		Iterator<String> Iterator_Obj = All_windowHandles.iterator();

		while (Iterator_Obj.hasNext()) {

			WebDriver window_title = driver.switchTo().window(Iterator_Obj.next());
			System.out.println(window_title.getCurrentUrl()+" = "+window_title.getTitle());
		}
		driver.quit();
	}}
