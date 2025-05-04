package _S_05_10_03_Basic_All;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Etrain_Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.navigate().to("https://etrain.info/in");

		String Main_window = d.getWindowHandle();
		WebElement Get_Trains = d.findElement(By.xpath("//*[@id=\"tbssbmtbtn\"]"));
		Get_Trains.click();

		Thread.sleep(3000);

		Set<String> notification = d.getWindowHandles();

		for (String allWin : notification) {
			d.switchTo().window(allWin);

		}
		WebElement Close_Button = d.findElement(By.xpath("/html/body/div[2]/div/a/i"));
		Close_Button.click();

		d.switchTo().window(Main_window);
		WebElement From_Box = d.findElement(By.xpath("//*[@id=\"tbsfi1\"]"));
		From_Box.sendKeys("COIMBATORE JN");

		WebElement To_Box = d.findElement(By.xpath("//*[@id=\"tbsfi3\"]"));
		To_Box.sendKeys("KODUMUDI");
		Thread.sleep(3000);
		Get_Trains.click();
	}
}
