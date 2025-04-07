package _S_05_10_02_Basic_All;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SLIDER1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://banzai.org/wellness/resources/interest");
		d.manage().window().maximize();

		WebElement Starting_Balance = d.findElement(By.xpath("//*[@id=\"interest-calculator-starting-balance\"]"));

		Starting_Balance.clear();
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].value='$5000';", Starting_Balance);
		
		Thread.sleep(5000);
		

		WebElement Interest_Rate = d.findElement(By.xpath("//*[@id=\"interest-calculator-interest-rate\"]"));


		Actions Interest_Rate_Bar = new Actions(d);
		Interest_Rate_Bar.dragAndDropBy(Interest_Rate, 4,  14).build().perform();
		
		}}
