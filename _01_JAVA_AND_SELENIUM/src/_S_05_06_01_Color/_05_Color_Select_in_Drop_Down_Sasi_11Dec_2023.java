package _S_05_06_01_Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _05_Color_Select_in_Drop_Down_Sasi_11Dec_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.navigate().to("https://cx.indianoil.in/webcenter/portal/LPG/pages_lpgservicenewconnection");
		
		WebElement Sign_in = d.findElement(By.xpath("//*[@id=\"btnId\"]"));
		String Color_of_Sign_in = Sign_in.getCssValue("background-color");
		System.out.println("Color_of_Color_of_Sign_in = "+Color_of_Sign_in);
		
			
	}

}
