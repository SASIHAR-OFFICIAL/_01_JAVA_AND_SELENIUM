package _S_05_10_02_Basic_All;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_BasicGoogle_Translate_Sasi_Basic_Home {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver F = new FirefoxDriver();
F.get("https://translate.google.co.in/?hl=en&tab=wT&authuser=0");

WebElement Drop_down = F.findElement(By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[1]/c-wiz/div[5]/button/div[3]"));
Drop_down.click();
Thread.sleep(1500);
WebElement Tamil_lan = F.findElement(By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div/div[1]/c-wiz/div[2]/c-wiz/div[2]/div/div[3]/div/div[2]/div[116]/div[2]"));
Tamil_lan.click();

WebElement Search_Box = F.findElement(By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[3]/c-wiz[1]/span/span/div/textarea"));
Search_Box.sendKeys("INDIA");
	}

}
