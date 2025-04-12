package _S_05_10_02_Basic_All;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_click {

	public static void main(String[] args) {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.google.co.in/");
		
		WebElement search_box = d.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		search_box.sendKeys("Coimbatore");
		WebElement Search_Box = d.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));
		Search_Box.click();
		

	}

}
