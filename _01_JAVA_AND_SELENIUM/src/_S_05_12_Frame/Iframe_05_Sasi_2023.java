package _S_05_12_Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_05_Sasi_2023 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver(); //navigates to the Browser
	    d.get("https://www.hyrtutorials.com/p/frames-practice.html"); 
	    List<WebElement> iframe = d.findElements(By.tagName("iframe"));
	    int iframe_size = iframe.size();
	    System.out.println("iframe_size = "+iframe_size);
	    
	    d.switchTo().frame("frm1");
	    WebElement Menu = d.findElement(By.id("selectnav2"));
	    Menu.click();
	}

}
