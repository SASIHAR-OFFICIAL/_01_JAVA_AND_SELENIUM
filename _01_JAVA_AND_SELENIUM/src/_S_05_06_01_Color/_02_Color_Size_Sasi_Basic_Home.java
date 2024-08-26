package _S_05_06_01_Color;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _02_Color_Size_Sasi_Basic_Home {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver fDriver = new FirefoxDriver();
fDriver.manage().window().maximize();
fDriver.get("https://www.prokerala.com/general/calendar/tamilcalendar.php");
Thread.sleep(10000);
WebElement TopBox = fDriver.findElement(By.xpath("/html/body/div/header/div[1]/div/div"));
String Color_of_Box =TopBox.getCssValue("background-color");
System.out.println("Color_of_Box = "+Color_of_Box);
System.out.println("------------------------------");

WebElement RightSquareBox =fDriver.findElement(By.xpath("/html/body/div/header/div[1]/div/div"));
Dimension Size_of_RightSquareBox =RightSquareBox.getSize();
int Height =Size_of_RightSquareBox.getHeight();
int Width = Size_of_RightSquareBox.getWidth();
System.out.println("RightSquareBox Height = "+Height +'\n'+"RightSquareBox Width = "+Width);
System.out.println("------------------------------");


WebElement NameBox = fDriver.findElement(By.xpath("//*[@id=\"fin_name\"]"));
NameBox.sendKeys("abcd");

WebElement PlaceDOB = fDriver.findElement(By.xpath("//*[@id=\"fin_location\"]"));
PlaceDOB.sendKeys("madras");
	}

}
