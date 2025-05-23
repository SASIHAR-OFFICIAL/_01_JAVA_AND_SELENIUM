package _S_05_25_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class _05_TestNG_Test_Suite {
	WebDriver driver;
	long start_time, End_Time, Total_Time;
	
	@BeforeSuite
	void Open_Browser() {
		start_time = System.currentTimeMillis();
		driver = new FirefoxDriver();
	}
	@Test
	void google(){
		driver.navigate().to("https://www.google.com");
	}
	@Test
	void BING(){
		driver.navigate().to("https://www.bing.com");
	}
	@Test
	void bbc(){
		driver.navigate().to("https://www.bbc.com");
	}
	@AfterSuite
	void Close_Browser(){
		driver.quit();
		End_Time =System.currentTimeMillis();
		Total_Time = End_Time-start_time;
		System.out.println("Total_Time = "+Total_Time);
	}
}
