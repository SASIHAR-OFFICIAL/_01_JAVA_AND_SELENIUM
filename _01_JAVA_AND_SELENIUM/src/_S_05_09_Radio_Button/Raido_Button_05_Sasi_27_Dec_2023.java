package _S_05_09_Radio_Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Raido_Button_05_Sasi_27_Dec_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();

		d.navigate().to("https://demo.guru99.com/test/radio.html");
		WebElement Option_1 = d.findElement(By.xpath("//*[@id=\"vfb-7-1\"]"));
		Option_1.click();
		
	}

}
