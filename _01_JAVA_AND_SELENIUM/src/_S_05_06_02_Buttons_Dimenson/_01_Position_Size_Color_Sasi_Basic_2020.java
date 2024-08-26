package _S_05_06_02_Buttons_Dimenson;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class _01_Position_Size_Color_Sasi_Basic_2020 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://testleaf.herokuapp.com/pages/Button.html");
		
		
		WebElement getPositionButton=d.findElement(By.id("position"));
	    Point xyPoint=getPositionButton.getLocation();
		double xPosition=xyPoint.getX();
		double yposition=xyPoint.getY();
		System.out.println("X value is :"+ xPosition +"\nY value is :" +yposition);
		
		WebElement color=d.findElement(By.id("color"));
		String buttoncolor=color.getCssValue("background-color");
		System.out.println("The color is " +buttoncolor);
		
		WebElement size=d.findElement(By.id("size"));
		int buttonHight=size.getSize().getHeight();
		int buttonWidth=size.getSize().getWidth();
		System.out.println("hight is: " +buttonHight +"\nWidth is: " +buttonWidth);
		
		WebElement homeButton=d.findElement(By.id("home"));
		homeButton.click();
		
		}

}
