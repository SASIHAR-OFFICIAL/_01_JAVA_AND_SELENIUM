package _S_05_11_02_06_Open_Multiple_at_Once;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BSNL_TRY {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://cymn.bsnl.co.in/cymnportal/Home.do");

List<WebElement> States = driver.findElements(By.xpath("//div/h3"));
for (WebElement webElement : States) {
	WebDriverWait some_element = new WebDriverWait(driver, Duration.ofSeconds(30));
	some_element.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/h3")));
	webElement.click();
	
	driver.switchTo().newWindow(WindowType.TAB);
	Thread.sleep(10000);
	driver.navigate().to("https://cymn.bsnl.co.in/cymnportal/Home.do");
}
}}
