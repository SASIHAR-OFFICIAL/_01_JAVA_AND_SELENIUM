package _S_05_11_03_Windows_Handle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _09_Window_Handle_Keep_Wished_Open_Sasi_24_Jun_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver d = new FirefoxDriver();
d.manage().window().maximize();

d.navigate().to("https://x.com/");
d.switchTo().newWindow(WindowType.TAB);
d.navigate().to("https://www.facebook.com");
d.switchTo().newWindow(WindowType.TAB);
d.navigate().to("https://www.instagram.com/");
d.switchTo().newWindow(WindowType.TAB);
d.navigate().to("https://www.youtube.com/");

String URL_Keep_Open = "https://www.instagram.com/";
Set<String> windowHandles = d.getWindowHandles();
String Tab_to_be_opened = null;

for (String Windows_Check : windowHandles) {
	d.switchTo().window(Windows_Check);
	if (d.getCurrentUrl().equals(URL_Keep_Open)) {
		Tab_to_be_opened = Windows_Check;
		break;
		}}
for (String Windows_Check : windowHandles) {
	d.switchTo().window(Windows_Check);
	if (!Windows_Check.equals(Tab_to_be_opened)) {
		Thread.sleep(1000);
		d.close();
	}}}}
