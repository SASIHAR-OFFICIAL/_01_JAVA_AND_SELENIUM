package _S_05_08_Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_11_Sasi_25_Jun_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://letcode.in/alert");
		

		WebElement Simple_Alert = d.findElement(By.xpath("//*[@id=\"accept\"]"));
		Simple_Alert.click();
		
		Alert Simple_Alert_clicked = d.switchTo().alert();
		Thread.sleep(1000);
		Simple_Alert_clicked.accept();

		WebElement Dismiss_Alert  = d.findElement(By.xpath("//*[@id=\"confirm\"]"));
		Dismiss_Alert.click();
		Alert Dismiss_Alert_Clicked = d.switchTo().alert();
		Thread.sleep(1000);
		String Dismiss_Alert_Clicked_text = Dismiss_Alert_Clicked.getText();
		System.out.println("Dismiss_Alert_Clicked_text = "+Dismiss_Alert_Clicked_text);
		Dismiss_Alert_Clicked.dismiss();
	
		WebElement Prompt_Alert = d.findElement(By.xpath("//*[@id=\"prompt\"]"));
		Prompt_Alert.click();
		Alert Prompt_Alert_Clicked = d.switchTo().alert();
		Thread.sleep(1000);
		Prompt_Alert_Clicked.sendKeys("Prompt_Alert_Clicked");
		Prompt_Alert_Clicked.accept();
		
		WebElement Modern_Alert = d.findElement(By.xpath("//*[@id=\"modern\"]"));
		Modern_Alert.click();
		//Alert Modern_Alert_Clicked = d.switchTo().alert();
		Thread.sleep(1000);
		WebElement Modern_Alert_Clicked = d.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/button"));
		Modern_Alert_Clicked.click();
	}}
