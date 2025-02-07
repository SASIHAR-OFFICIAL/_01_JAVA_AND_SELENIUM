package _S_05_08_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_05_Sasi_Basic_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F_Driver = new FirefoxDriver();
		F_Driver.manage().window().maximize();
		F_Driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		
		WebElement ShoweMe_1 =F_Driver.findElement(By.xpath("//*[@id=\"alertexamples\"]"));
		ShoweMe_1.click();
		Alert ShoweMe_1_Alert = F_Driver.switchTo().alert();
		Thread.sleep(3000);
		ShoweMe_1_Alert.accept();
		
		WebElement ShowMe_2 = F_Driver.findElement(By.xpath("//*[@id=\"confirmexample\"]"));
		ShowMe_2.click();
		Alert ShowMe_2_Alert = F_Driver.switchTo().alert();
		Thread.sleep(3000);
		ShowMe_2_Alert.dismiss();
		
		WebElement ShowMe_3 = F_Driver.findElement(By.xpath("//*[@id=\"promptexample\"]"));
		ShowMe_3.click();
		Alert ShowMe_3_Alert = F_Driver.switchTo().alert();
		Thread.sleep(3000);
		ShowMe_3_Alert.sendKeys("ABCDEF_1234567");
		Thread.sleep(3000);
		ShowMe_3_Alert.accept();
		
	}

}
