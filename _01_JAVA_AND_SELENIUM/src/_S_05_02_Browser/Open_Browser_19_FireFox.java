package _S_05_02_Browser;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Open_Browser_19_FireFox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver d	= new FirefoxDriver();
d.manage().window().maximize();
d.navigate().to("https://www.poorvika.com/");

Thread.sleep(3000);
WebElement Search_Bar = d.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div[2]/div/div/form/input"));
Search_Bar.sendKeys("Itel"+Keys.ENTER);
Thread.sleep(3000);
WebElement Show_more = d.findElement(By.xpath("/html/body/div/div/div[4]/div/div/div/div[2]/div/div[3]/button"));

String color = Show_more.getCssValue("background");
System.out.println("Color"+color);
	}
}


