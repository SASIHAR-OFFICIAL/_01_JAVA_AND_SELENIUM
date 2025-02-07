package _S_05_04_Links;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.server.handler.MaximizeWindow;

public class Link_Text_01_Sasi_Basic_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.manage().window().maximize();
d.get("https://www.google.co.in");
d.findElement(By.name("q")).sendKeys("COIMBATORE"+Keys.ENTER);
d.findElement(By.linkText("Coimbatore - Wikipedia")).click();
		
	}

}
