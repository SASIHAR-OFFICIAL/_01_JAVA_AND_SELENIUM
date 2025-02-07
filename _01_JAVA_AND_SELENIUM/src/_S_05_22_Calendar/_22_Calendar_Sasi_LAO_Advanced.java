package _S_05_22_Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _22_Calendar_Sasi_LAO_Advanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe"
				+ ""
				+ "");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.leafground.com/pages/Calendar.html");
		
		d.findElement(By.id("datepicker")).click();
		
		WebElement nextButton = d.findElement(By.xpath("//a[@title='Next']"));
		nextButton.click();
		
		WebElement dateSelect = d.findElement(By.xpath("//a[contains(text(),'10')]"));
		dateSelect.click();
	}

}
