package _S_05_10_02_Basic_All;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SLIDER {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.navigate().to("https://banzai.org/wellness/resources/interest");
		
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,3000)", "");

		WebElement Starting_Balance = d.findElement(By.xpath("//*[@id=\"interest-calculator-starting-balance\"]"));
		//*[@id="interest-calculator-starting-balance"]

		String text = Starting_Balance.getAttribute("value");
		System.out.println("Starting_Balance = "+text);

	
		js.executeScript("arguments[0].value='$85000';", Starting_Balance);
		
	

		WebElement Interest_Rate = d.findElement(By.xpath("//*[@id=\"interest-calculator-interest-rate\"]"));
		Thread.sleep(5000);
		Actions Interest_Rate_Bar = new Actions(d);
		Interest_Rate_Bar.dragAndDropBy(Interest_Rate, 4, 12).build().perform();
		Thread.sleep(3000);
		d.quit();



	}

}
