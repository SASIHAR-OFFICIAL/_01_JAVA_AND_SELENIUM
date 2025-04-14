package _S_05_10_02_Basic_All;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AXH0vVuAb-MZosiUEUz-NTDljlDMFfmxCfNnPjPp3XAi7D-eZu5pDO9nOVH5WV5y7dPafzVfI3bQHg&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S389230449%3A1744554708952166");
		WebElement UserName = d.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		UserName.sendKeys("sasiharandroid"+Keys.ENTER);
		
		
	}

}
