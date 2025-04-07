package _S_05_10_02_Basic_All;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ETRAIN_SendText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://etrain.info/in");
		d.manage().window().maximize();
		WebElement from = d.findElement(By.xpath("//*[@id=\"tbsfi1\"]"));
		from.sendKeys("CBE");
		WebElement To = d.findElement(By.xpath("//*[@id=\"tbsfi3\"]"));
		To.sendKeys("KMD");
		Thread.sleep(10000);
		WebElement Get_Trains = d.findElement(By.xpath("//*[@id=\"tbssbmtbtn\"]"));
		Get_Trains.click();
	}

}
