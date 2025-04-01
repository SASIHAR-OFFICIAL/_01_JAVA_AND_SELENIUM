package _S_04_LEARN;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LEARING {

	public static void main(String[] args) {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://ttdconline.com/index.jsp");
		List<WebElement> links = d.findElements(By.tagName("a"));
		for (WebElement link : links) {
		    System.out.println(link.getText());
		}

	}

}
