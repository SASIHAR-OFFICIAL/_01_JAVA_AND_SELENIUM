package _S_05_11_03_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _06_Window_Handle_Keep_Wished_Open_Sasi_21_Jun_24 {

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
		
// web to be open
		String URL_remain_open ="https://www.leafground.com/";
//Name Opens tabs
		Set<String> Tab_Handles = d.getWindowHandles();
String TAB_remain_open =null;

//Find Wanted web page
for (String Tabs_Window : Tab_Handles) {
	d.switchTo().window(Tabs_Window);
	if (d.getCurrentUrl().equals(URL_remain_open)) {
		TAB_remain_open = Tabs_Window;
		break;
		}}
//Close Others
for (String Tabs_Window : Tab_Handles) {
	d.switchTo().window(Tabs_Window);
if (!Tabs_Window.equals(TAB_remain_open)) {
	Thread.sleep(1000);
	d.close();
}}}}
