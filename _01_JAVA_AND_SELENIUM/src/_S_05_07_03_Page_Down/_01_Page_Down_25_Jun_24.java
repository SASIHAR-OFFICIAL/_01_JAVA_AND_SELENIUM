package _S_05_07_03_Page_Down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class _01_Page_Down_25_Jun_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://www.amazon.in/");
		Thread.sleep(1000);
		
		JavascriptExecutor Page_Up_Down = (JavascriptExecutor)d;
		Page_Up_Down.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(1000);
		Page_Up_Down.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(1000);
		Page_Up_Down.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(1000);
		Page_Up_Down.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(1000);
		Page_Up_Down.executeScript("window.scrollBy(0,-4000)", "");
		}}
