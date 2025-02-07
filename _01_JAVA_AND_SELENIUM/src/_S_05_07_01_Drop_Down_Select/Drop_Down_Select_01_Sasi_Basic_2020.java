package _S_05_07_01_Drop_Down_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Select_01_Sasi_Basic_2020 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement dropdown1=d.findElement(By.id("dropdown1"));
		Select select1 = new Select(dropdown1);
		select1.selectByIndex(1);

		WebElement dropdown2=d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/select"));
		Select select2=new Select(dropdown2);
		select2.selectByVisibleText("Appium");

		WebElement dropdown3=d.findElement(By.id("dropdown3"));
		Select select3=new Select(dropdown3);
		select3.selectByValue("3");
		
	}}