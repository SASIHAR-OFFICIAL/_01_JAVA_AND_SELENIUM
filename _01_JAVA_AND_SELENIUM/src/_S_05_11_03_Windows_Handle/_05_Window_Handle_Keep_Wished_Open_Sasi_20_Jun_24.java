package _S_05_11_03_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _05_Window_Handle_Keep_Wished_Open_Sasi_20_Jun_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://translate.google.co.in/?hl=en&tab=wT&authuser=0");
		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://www.tamildailycalendar.com/tamil_daily_calendar.php");
		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://www.leafground.com/");
		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://www.bbc.com/");
// WEB PAGE TO KEEP OPEN
		String Keep_open = "https://www.tamildailycalendar.com/tamil_daily_calendar.php";
// Name Open all Tabs / Window
		Set<String> Opened_Tabs = d.getWindowHandles();
// Find the WEB 	PAGE OF IN OPENED TABS
		String Tab_Open_Window = null;
		for (String Windows_To_Check : Opened_Tabs) {
			d.switchTo().window(Windows_To_Check);
			if (d.getCurrentUrl().equals(Keep_open)) {
				Tab_Open_Window = Windows_To_Check;
			}}
// Close Others TABS
		for (String Windows_To_Check : Opened_Tabs) {
			d.switchTo().window(Windows_To_Check);
			if (!Windows_To_Check.equals(Tab_Open_Window)) {
				Thread.sleep(1000);
				d.close();
			}}}}
