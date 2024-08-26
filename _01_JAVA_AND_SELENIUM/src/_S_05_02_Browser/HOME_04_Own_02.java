package _S_05_02_Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HOME_04_Own_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
FirefoxDriver driver = new FirefoxDriver();
driver.navigate().to("https://www.leafground.com/calendar.xhtml");

WebElement Next = driver.findElement(By.xpath("//button[text()='Next']"));
Next.click();

WebElement Select_Number = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
Select_Number.click();

//a[text()='10']
	}

}
