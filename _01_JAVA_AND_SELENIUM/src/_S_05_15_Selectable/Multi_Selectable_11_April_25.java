package _S_05_15_Selectable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Multi_Selectable_11_April_25 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		//d.manage().window().maximize();
		d.navigate().to("https://www.selenium.dev/selenium/web/selectableItems.html");
		
		List<WebElement> continents  = d.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		
		int continents_size = continents.size();
		System.out.println("continents_size ="+continents_size);
		
		Actions selectable = new Actions(d);
		selectable.keyDown(Keys.CONTROL).click(continents.get(0)).click(continents.get(3)).click(continents.get(5)).click(continents.get(6)).build().perform();
	}}
