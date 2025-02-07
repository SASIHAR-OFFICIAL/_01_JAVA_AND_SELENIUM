package _S_01_IT_ST;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IT_ST_00_Webpage_open_1_Teached {

	/**
	 * @param args
	 */
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.get("http://www.google.com");
			d.findElement(By.name("q")).sendKeys("coimbatore"+Keys.ENTER);
			
			
				}

	}
