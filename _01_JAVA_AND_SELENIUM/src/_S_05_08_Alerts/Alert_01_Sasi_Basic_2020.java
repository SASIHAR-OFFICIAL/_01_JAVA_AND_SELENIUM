package _S_05_08_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_01_Sasi_Basic_2020 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://www.leafground.com/pages/Alert.html");
		
		WebElement alertBox = d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/button"));
		alertBox.click();
		Alert alert = d.switchTo().alert();
		Thread.sleep(1000);
		System.out.println("Alert Text is ="+alert.getText());
		alert.accept();
		
		WebElement confirmBox  = d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		confirmBox.click();
		Alert confirmAlert = d.switchTo().alert();
		Thread.sleep(1000);
		System.out.println("confirmAlert Text is ="+confirmAlert.getText());
		confirmAlert.dismiss();
		
		WebElement promptBox = d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/button"));
		promptBox.click();
		Alert sendText = d.switchTo().alert();
		Thread.sleep(1000);
		System.out.println("Alert Text is ="+sendText.getText());
		sendText.sendKeys("TYPED BY ME");
		sendText.accept();
		
	}

}
