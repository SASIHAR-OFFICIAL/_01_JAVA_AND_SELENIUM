package _S_05_12_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_15_Sasi_25_June_2024 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://letcode.in/frame");

		d.switchTo().frame("firstFr");

		WebElement First_Name = d.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[1]/div/input"));
		First_Name.sendKeys("Ramu");

		WebElement Last_Name = d.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/form/div[2]/div/input"));
		Last_Name.sendKeys("Somu");
	
		WebElement Email_Frame = d.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div[2]/iframe"));
		d.switchTo().frame(Email_Frame);
		WebElement EMail = d.findElement(By.xpath("//html/body/app-root/app-innerframe/div/div/div/div/div/input"));
		EMail.sendKeys("email@email.com");
		Thread.sleep(2000);
		System.out.println("Windows Size = "+d.manage().window().getSize());
		JavascriptExecutor PageDown =(JavascriptExecutor)d;
		PageDown.executeScript("window.scrollBy(1376, 744)", "");
		}}
