package _S_05_06_01_Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _06_Color_Check {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
//		System.setProperty("Webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
//		WebDriver d = new ChromeDriver();
		d.navigate().to("https://www.testim.io/blog/selenium-get-attribute/");
		
		Thread.sleep(1000);
		
		WebElement Home_Box = d.findElement(By.xpath("/html/body/div[1]/div/header/div/div/div/div/a[2]"));
		String Home_Box_Color = Home_Box.getCssValue("background-color");
		System.out.println("Home_Box = "+Home_Box_Color);
	}

}
