package _S_05_21_Dynamic_Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic_Tables_19_APRIL_25 {

	public static void main(String[] args) {

		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://practice.expandtesting.com/dynamic-table");
		
		List<WebElement> Columns = d.findElements(By.tagName("th"));
		int Columns_Size = Columns.size();
		System.out.println("Columns_Size ="+Columns_Size);
		
		List<WebElement> Rows = d.findElements(By.tagName("tr"));
		int Row_Size = Rows.size();
		System.out.println("Columns_Size ="+Row_Size);
	}

}
