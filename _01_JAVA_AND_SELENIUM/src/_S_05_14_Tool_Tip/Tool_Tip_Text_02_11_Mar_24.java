package _S_05_14_Tool_Tip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tool_Tip_Text_02_11_Mar_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver d = new FirefoxDriver();

d.navigate().to("https://jqueryui.com/tooltip/");

d.switchTo().frame(0);

WebElement Tooltips = d.findElement(By.xpath("/html/body/p[1]/a"));
String Title_words = Tooltips.getAttribute("title");
System.out.println("Tool Tip Word = "+Title_words);
System.out.println("-_______________________________________________-");


Actions Mouse_Action = new Actions(d);
Mouse_Action.moveToElement(Tooltips).build().perform();
Thread.sleep(3000);


WebElement ThemeRoller = d.findElement(By.xpath("/html/body/p[2]/a"));
String ThemeRoller_Words = ThemeRoller.getAttribute("title");
System.out.println("ThemeRoller_Words = "+ThemeRoller_Words);
System.out.println("*****************************************************");
Mouse_Action.moveToElement(ThemeRoller).build().perform();
Thread.sleep(3000);

WebElement Age_Box = d.findElement(By.xpath("//*[@id=\"age\"]"));
String Age_Box_Words = Age_Box.getAttribute("title");
System.out.println("Age_Box_Words = "+Age_Box_Words);
System.out.println("-------------------------------------------------");
Mouse_Action.moveToElement(Age_Box).build().perform();
Thread.sleep(3000);

d.close();




	}
	

}
