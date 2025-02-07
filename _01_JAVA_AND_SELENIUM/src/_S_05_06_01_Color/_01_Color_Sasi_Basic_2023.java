package _S_05_06_01_Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _01_Color_Sasi_Basic_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver();
		F.manage().window().maximize();
		F.get("https://www.saucedemo.com/");
		WebElement FindColor = F.findElement(By.xpath("//*[@id=\"login-button\"]"));
		String ColorBox = FindColor.getCssValue("background-color");
		System.out.println(" Color is "+ColorBox);
				
		
		
		
	}

}
