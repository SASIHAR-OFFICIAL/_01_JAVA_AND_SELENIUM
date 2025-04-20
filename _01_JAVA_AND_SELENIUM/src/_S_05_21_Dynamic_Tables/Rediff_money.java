package _S_05_21_Dynamic_Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rediff_money {

	public static void main(String[] args) {
		
		WebDriver d = new FirefoxDriver();

	d.navigate().to("https://money.rediff.com/gainers");
	
	List<WebElement> th = d.findElements(By.tagName("th"));
	System.out.println("Total Header = "+th.size());
	
	List<WebElement> tr = d.findElements(By.tagName("tr"));
	System.out.println("Total Row = "+tr.size());

	List<WebElement> td = d.findElements(By.tagName("td"));
	System.out.println("Total data = "+td.size());
		

	}

}
