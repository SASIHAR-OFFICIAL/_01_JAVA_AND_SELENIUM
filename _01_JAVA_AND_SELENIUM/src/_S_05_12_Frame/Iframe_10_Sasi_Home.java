package _S_05_12_Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_10_Sasi_Home {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/auto-complete/#Categories");
		Thread.sleep(3000);


		WebElement Frame_Search = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div[1]/p/iframe"));

		driver.switchTo().frame(Frame_Search);
		
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("a");
		Thread.sleep(3000);
		List<WebElement> Elements_in_Search = driver.findElements(By.xpath("//*[@id=\"search\"]/li"));
		System.out.println(Elements_in_Search.size());
		
		for (WebElement Element_Store_here : Elements_in_Search) {
			if (Element_Store_here.getText().equals("annttop C13")) {
				Thread.sleep(10000);

				Element_Store_here.sendKeys(Keys.ENTER);
				break;
			}
		}
	}
}