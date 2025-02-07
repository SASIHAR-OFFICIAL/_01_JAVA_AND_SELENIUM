package _S_05_04_Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Link_Text_08_Sasi_Basic_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.geko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver F = new FirefoxDriver();
F.get("https://www.careinsurance.com/");
F.findElement(By.xpath("/html/body/section[2]/header/div[2]/div/div[2]/div[2]/div[2]/div/ul/li[1]/a")).click();
	}

}
