package _S_05_04_Links;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Link_Text_09_Sasi_Basic_Home {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException 
		// TODO Auto-generated method stub
		{
			System.setProperty("wedriver.gecko.driver","C:\\SELENIUM WEBDRIVER\\geckodriver-v0.32.2-win64\\geckodriver.exe");
			WebDriver Firefox = new FirefoxDriver();
			Thread.sleep(5000);

			Firefox.get("https://www.google.com");
			Firefox.manage().window().maximize();
			Thread.sleep(5000);

			Firefox.findElement(By.name("q")).sendKeys("Kovai"+Keys.ENTER);
			Thread.sleep(5000);

			Firefox.findElement(By.xpath("/html/body/div[6]/div/div[13]/div[4]/div[1]/div[2]/div/div/div/div/div/div/div/div/div/div/div/div[4]/div/div/div/div/div/div[1]/div/div/a")).click();
		}			
		}