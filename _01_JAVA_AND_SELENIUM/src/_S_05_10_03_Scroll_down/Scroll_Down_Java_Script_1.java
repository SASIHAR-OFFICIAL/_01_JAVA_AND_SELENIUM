package _S_05_10_03_Scroll_down;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll_Down_Java_Script_1 {

	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https://www.docker.com/");
	
	JavascriptExecutor JSE_Obj = (JavascriptExecutor) driver;
	JSE_Obj.executeScript("window.scrollBy(0,2500)");

	}

}
