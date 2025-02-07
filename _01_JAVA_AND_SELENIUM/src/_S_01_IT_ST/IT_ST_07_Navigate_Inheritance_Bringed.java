package _S_01_IT_ST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IT_ST_07_Navigate_Inheritance_Bringed {
	
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