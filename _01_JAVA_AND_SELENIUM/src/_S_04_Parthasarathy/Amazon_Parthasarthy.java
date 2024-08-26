package _S_04_Parthasarathy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class Amazon_Parthasarthy  {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		d.navigate().to("https://www.amazon.in");
		//d.navigate().to(U1);
	
	}
	
}
class Url1{
	static String U1="https://www.amazon.in";
}