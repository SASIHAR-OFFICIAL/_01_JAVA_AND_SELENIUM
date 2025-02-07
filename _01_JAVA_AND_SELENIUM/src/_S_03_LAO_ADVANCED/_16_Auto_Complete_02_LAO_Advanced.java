package _S_03_LAO_ADVANCED;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _16_Auto_Complete_02_LAO_Advanced {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.globalsqa.com/demo-site/auto-complete/#Categories");


		//driver.switchTo().frame(0);
		WebElement Frame_Search = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div[1]/p/iframe"));

		driver.switchTo().frame(Frame_Search);
		//driver.switchTo().frame(0);

		//WebDriver frame = driver.switchTo().frame(3);
		//String title = frame.getTitle();
		//System.out.println("title ="+title);

		driver.findElement(By.id("search")).sendKeys("a");
		Thread.sleep(3000);
		List<WebElement> Elements_in_Search = driver.findElements(By.xpath("//*[@id=\"search\"]/li"));
		System.out.println(Elements_in_Search.size());
		Thread.sleep(3000);

		for (WebElement Element_Store_here : Elements_in_Search) {
			if (Element_Store_here.getText().equals("annttop C13")) {
				Element_Store_here.click();
				break;
			}
		}
	}
}






