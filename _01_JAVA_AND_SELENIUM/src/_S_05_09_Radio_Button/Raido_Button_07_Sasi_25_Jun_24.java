package _S_05_09_Radio_Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Raido_Button_07_Sasi_25_Jun_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://letcode.in/radio");
		
		WebElement Select_any_one = d.findElement(By.xpath("//*[@id=\"yes\"]"));
		Select_any_one.click();
		
		WebElement Foo = d.findElement(By.xpath("//*[@id=\"foo\"]"));
		String Foo_Status= Foo.getAttribute("checked");
		
//		System.out.println("equals ="+equals);
		
		WebElement Bar = d.findElement(By.xpath("//*[@id=\"notfoo\"]"));
		String attribute = Bar.getAttribute("checked");
		
		System.out.println("attribute ="+attribute);
		Thread.sleep(1000);
		d.close();
		
	}}
