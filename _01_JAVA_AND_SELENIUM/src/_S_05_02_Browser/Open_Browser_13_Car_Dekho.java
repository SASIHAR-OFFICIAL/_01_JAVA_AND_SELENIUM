package _S_05_02_Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Open_Browser_13_Car_Dekho {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://www.cardekho.com/compare/tata-tigor-and-honda-city.htm");
		Thread.sleep(5000);
		
		List<WebElement>  List_Row = d.findElements(By.xpath("//*[@id=\"changeVariant1\"]/li"));
	
		WebElement element1 = d.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/main/section/div/div/div/ul/li[1]/div[2]/div[2]/div[1]/div/div/div/ul/li[1]"));
		String text1 = element1.getText();
		System.out.println("text");
	}

}
