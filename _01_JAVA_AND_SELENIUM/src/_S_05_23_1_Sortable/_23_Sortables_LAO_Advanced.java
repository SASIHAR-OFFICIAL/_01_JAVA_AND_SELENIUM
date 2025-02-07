package _S_05_23_1_Sortable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _23_Sortables_LAO_Advanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.leafground.com/pages/sortable.html");
		
		List<WebElement> allItems = d.findElements(By.xpath("//*[@id='sortable']/li"));
		
		WebElement fromItem=allItems.get(6);
		WebElement toItems =allItems.get(0);
		
		Actions actions = new Actions(d);
		
		actions.clickAndHold(fromItem);
		actions.moveToElement(toItems);
		actions.release(toItems);
		actions.build().perform();
		
	}

}
