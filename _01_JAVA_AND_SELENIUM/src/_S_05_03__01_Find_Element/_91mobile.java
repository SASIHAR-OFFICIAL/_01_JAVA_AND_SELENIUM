package _S_05_03__01_Find_Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _91mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://www.91mobiles.com/phonefinder.php");
		WebElement Five_G = d.findElement(By.xpath("/html/body/main/div/section/section[2]/aside[1]/div/aside/div[2]/div[3]/div/label[4]/input"));
		Five_G.click();
		
		
		

	}

}
