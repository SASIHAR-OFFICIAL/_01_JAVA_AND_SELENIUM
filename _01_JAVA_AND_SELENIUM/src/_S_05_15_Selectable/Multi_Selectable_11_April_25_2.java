package _S_05_15_Selectable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Multi_Selectable_11_April_25_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		//d.manage().window().maximize();
		d.navigate().to("https://automationintesting.com/selenium/testpage/");
//		Thread.sleep(5000);
//		JavascriptExecutor js = (JavascriptExecutor) d;
//	    js.executeScript("window.scrollBy(100,10)","");
//	       d.close();
//	       Thread.sleep(5000);
		List<WebElement> continents = d.findElements(By.xpath("//*[@id=\"continent\"]/option"));
		int continents_size = continents.size();
		System.out.println("continents_size ="+continents_size);
		//Thread.sleep(5000);
		
	
		Actions selectable = new Actions(d);
		selectable.keyDown(Keys.CONTROL).click(continents.get(0)).click(continents.get(1)).click(continents.get(2)).build().perform();
	}}
