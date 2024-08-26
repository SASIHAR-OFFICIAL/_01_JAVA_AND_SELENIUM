package _S_05_11_03_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _08_Window_Handle_Keep_Wished_Open_Sasi_21_Jun_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.careinsurance.com/");
		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://uidai.gov.in/");
		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://tamil.webdunia.com/");
		d.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("https://www.thetestingsquad.in/");
// WEB TO BE OPEN
		String url_To_be_Opened = "https://www.thetestingsquad.in/";
		String WebPage_to_be_Opened = null;
	
// Name open tabs window
		Set<String> Window_Opened = d.getWindowHandles();
		for (String window_Handles : Window_Opened ) {
			d.switchTo().window(window_Handles);
			if (d.getCurrentUrl().equals(url_To_be_Opened)) {
				WebPage_to_be_Opened =window_Handles;
				break;
			}}
		for (String window_Handles : Window_Opened) {
			d.switchTo().window(window_Handles);
			if (!window_Handles.equals(WebPage_to_be_Opened)) {
				Thread.sleep(1000);
				d.close();
			}}}}
	