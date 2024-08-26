package _S_02_LAO_BASIC;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _06_Alert_01_LAO_Basic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver();
		F.manage().window().maximize();
		F.get("https://www.leafground.com/alert.xhtml");
		
		WebElement  Alert_Simple_Dialog =F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span[2]"));
		Alert_Simple_Dialog.click();
		Thread.sleep(3000);

		Alert Alert_Simple_Dialog_Alert = F.switchTo().alert();
		Thread.sleep(3000);
		Alert_Simple_Dialog_Alert.accept();
	}

}
