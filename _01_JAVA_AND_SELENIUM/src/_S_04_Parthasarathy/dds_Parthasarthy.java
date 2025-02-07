package _S_04_Parthasarathy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dds_Parthasarthy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://brm.tremplintech.in/web_pages/login.aspx");
		d.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
		
		
		
		
	}

}
