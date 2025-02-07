package _S_05_23_2_Advanced_All;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EB_Reading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver d = new FirefoxDriver();
d.manage().window().maximize();

d.navigate().to("https://www.tnebnet.org/awp/login;jsessionid=16B32D52E51573885E8CA6D6147CC5AF.node1");
WebElement userName = d.findElement(By.id("userName"));
userName.sendKeys("sasi_vasan@yahoo");
WebElement password = d.findElement(By.id("password"));
password.sendKeys("eb0660bill");
WebElement Human_Check = d.findElement(By.xpath("//*[@id=\"CaptchaID\"]"));
Human_Check.click();
Thread.sleep(5000);

WebElement Login = d.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td/div[1]/div/div[2]/form/table/tbody/tr[1]/td[1]/table/tbody/tr[9]/td/input"));
Login.click();

WebElement Account_Summary = d.findElement(By.xpath("/html/body/div[1]/div/table/tbody/tr[3]/td/label/a[4]/img"));
Account_Summary.click();

//2622--------------------------------------------
WebElement Meter_2622 = d.findElement(By.xpath("/html/body/div[1]/div/table/tbody/tr[3]/td/form[2]/div/div/div/fieldset/div/div/table/tbody/tr[1]/td[4]/div/div/button/span[1]"));
Meter_2622.click();
Thread.sleep(4000);
JavascriptExecutor jse = (JavascriptExecutor)d;

jse.executeScript("window.scrollBy(0,3250)", "");
Thread.sleep(4000);
jse.executeScript("window.scrollBy(0,-750)", "");
Thread.sleep(4000);
//d.close();

	}

}
