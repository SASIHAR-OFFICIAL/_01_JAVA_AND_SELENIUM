package _S_05_14_Tool_Tip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tool_Tip_Text_01_LAO_Advanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.leafground.com/pages/tooltip.html");
		WebElement name = d.findElement(By.id("age"));
		String toolTipText =name.getAttribute("title");
		System.out.println("Text is : " +toolTipText);
		
		
		
	}

}
