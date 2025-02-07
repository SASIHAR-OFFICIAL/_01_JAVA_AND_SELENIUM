package _S_05_08_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_10_Sasi_22_Dec_23 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://demoqa.com/alerts");
		
		// Click_Me_1
		WebElement Click_Me_1 = d.findElement(By.xpath("//*[@id=\"alertButton\"]"));
		Click_Me_1.click();
		Thread.sleep(3000);
		Alert Click_Me_1_Alert = d.switchTo().alert();
		Thread.sleep(3000);
		Click_Me_1_Alert.accept();
		
		// Click_Me_3
		WebElement Click_Me_3 = d.findElement(By.xpath("//*[@id=\"confirmButton\"]"));
		Click_Me_3.click();
		Thread.sleep(3000);
		Alert Click_Me_3_Alert = d.switchTo().alert();
		Thread.sleep(3000);
		Click_Me_3_Alert.dismiss();
		
		
		
		// Click_Me_4
		
		WebElement Click_Me_4 = d.findElement(By.xpath("//*[@id=\"promtButton\"]"));
		Click_Me_4.click();
		Thread.sleep(3000);
		Alert Click_Me_4_Alert = d.switchTo().alert();
		Thread.sleep(3000);
		Click_Me_4_Alert.sendKeys("Testing");
		Click_Me_4_Alert.accept();
		
		 
		
	}

}
