package _S_05_08_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_04_Sasi_Basic_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F_Driver = new FirefoxDriver();
		F_Driver.manage().window().maximize();
		F_Driver.get("https://demoqa.com/alerts");
		
		WebElement ClickMe_1 = F_Driver.findElement(By.xpath("//*[@id=\"alertButton\"]"));
		ClickMe_1.click();
		Alert ClickMe_1_Alert = F_Driver.switchTo().alert();
		Thread.sleep(3000);
		ClickMe_1_Alert.accept();
		
		WebElement ClickMe_3 = F_Driver.findElement(By.xpath("//*[@id=\"confirmButton\"]"));
		ClickMe_3.click();
		Alert ClickMe_3_Alert =F_Driver.switchTo().alert();
		Thread.sleep(3000);
		ClickMe_3_Alert.dismiss();
		
		WebElement ClickMe_4 = F_Driver.findElement(By.xpath("//*[@id=\"promtButton\"]"));
		ClickMe_4.click();
		Alert ClickMe_4_Alert = F_Driver.switchTo().alert();
		Thread.sleep(3000);
		ClickMe_4_Alert.sendKeys("1234567890");
		Thread.sleep(3000);
		ClickMe_4_Alert.accept();

	}
}
