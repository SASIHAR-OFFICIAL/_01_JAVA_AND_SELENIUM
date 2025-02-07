package _S_05_11_03_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _04_Window_Handle_Keep_Wished_Open_Sasi_20_Jun_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://www.google.com/");
		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://mail.yahoo.com/");
		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://www.google.com/intl/en-US/gmail/about/");
		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=153&ct=1718862557&rver=7.0.6738.0&wp=MBI_SSL&wreply=https%3a%2f%2foutlook.live.com%2fowa%2f%3fcobrandid%3dab0455a0-8d03-46b9-b18b-df2f57b9e44c%26nlp%3d1%26RpsCsrfState%3d1f4a3f0f-bc01-1e11-b89a-a19066b29c87&id=292841&aadredir=1&CBCXT=out&lw=1&fl=dob%2cflname%2cwld&cobrandid=ab0455a0-8d03-46b9-b18b-df2f57b9e44c");
// WEB PAGE TO KEEP OPEN
		String Web_Page_Keep_open = "https://mail.yahoo.com/";
//Name Open all Tabs/ Window
		Set<String> All_4_Tabs = d.getWindowHandles();
//Find the WEB 	PAGE OF IN OPENED TABS
		String Tab_to_Be_Opened = null;
		for (String Opened_Windows : All_4_Tabs) {
			d.switchTo().window(Opened_Windows);
			if (d.getCurrentUrl().equals(Web_Page_Keep_open)) {
				Tab_to_Be_Opened = Opened_Windows;
				break;
	}}
// Close Others TABS
		for (String Opened_Windows : All_4_Tabs) {
			if (!Opened_Windows.equals(Tab_to_Be_Opened)) {
				d.switchTo().window(Opened_Windows);
				Thread.sleep(1000);
				d.close();
				}}}}
