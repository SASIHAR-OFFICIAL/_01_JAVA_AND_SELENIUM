package _S_05_15_Selectable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multi_Selectable_01_Sasi_Basic_2020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver", "C:\WebDriver\geckodriver\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.get("http://www.leafground.com/pages/selectable.html");*/
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.leafground.com/pages/selectable.html");
		
		
		//1. li is to show number of lists in side the xpath
		List<WebElement> selectTable = d.findElements(By.xpath("//*[@id=\"selectable\"]/li")); 
		int size = selectTable.size();
		System.out.println("No. of list :"+size);
		//2. Below codes are to Click and Select items		
		Actions actions = new Actions(d);
		// Options 1
		actions.keyDown(Keys.CONTROL).click(selectTable.get(0))
									 .click(selectTable.get(3))
		                             .click(selectTable.get(6))
		                             .build().perform();
		
		// Options 2
		/*actions.clickAndHold(selectTable.get(0))
			   .clickAndHold(selectTable.get(3))
		       .clickAndHold(selectTable.get(6))
		       .build().perform();*/
	}

}
