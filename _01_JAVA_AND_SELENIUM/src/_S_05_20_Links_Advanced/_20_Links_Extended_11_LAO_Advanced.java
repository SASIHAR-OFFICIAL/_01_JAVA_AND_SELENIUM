package _S_05_20_Links_Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _20_Links_Extended_11_LAO_Advanced {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver D = new FirefoxDriver();
		D.navigate().to("https://www.leafground.com/link.xhtml");

		WebElement Go_to_Dashboard = D.findElement(By.linkText("Go to Dashboard"));
		Go_to_Dashboard.click();
		D.navigate().back();
		// Check WEBSITE ADDRESS without visit the website
		WebElement Find_the_URL  = D.findElement(By.partialLinkText("Find the URL "));
		String URL = Find_the_URL.getAttribute("href");
		System.out.println("URL = "+URL);
		System.out.println("--------------------------");
		D.navigate().back();
		
		// Check WEBSITE broken are not without visit the website
		WebElement Broken = D.findElement(By.linkText("Broken?"));
		Broken.click();
		String Title = D.getTitle();
		if (Title.contains("404")) {
			System.out.println("The link is BROKEN");
		}else {
			System.out.println("The link is NOT BROKEN");
		}
		System.out.println("Title = "+Title);
		System.out.println("--------------------------");
		D.navigate().back();

		// 		LINKS IN THIS PAGE
		WebElement How_many_links_in_this = D.findElement(By.partialLinkText("How many links in this"));
		How_many_links_in_this.click();
		List<WebElement> How_many_links = D.findElements(By.tagName("a"));
		int Link_Count = How_many_links.size();
		System.out.println("Link_Count = "+Link_Count);
		
	}
}
