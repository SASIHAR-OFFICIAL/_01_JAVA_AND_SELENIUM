package _S_05_06_02_Buttons_Dimenson;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _04_Position_Size_Color_Sasi_Basic_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver F = new FirefoxDriver();
F.manage().window().maximize();
F.get("https://www.globalsqa.com/samplepagetest/");

// 1 = Find Position
WebElement Position_X_Y =  F.findElement(By.id("nav_menu-6"));
Point Location_X_Y = Position_X_Y.getLocation();
double X_Position =Location_X_Y.getX();
double Y_Position = Location_X_Y.getY();
System.out.println("X_Position ="+X_Position +'\n'+ "Y_Position =" +Y_Position);

System.out.println("----------------------------------");

WebElement Size = F.findElement(By.id("nav_menu-6"));
Dimension Box_Dimension = Size.getSize();
int Wid =Box_Dimension.getWidth();
int Hei =Box_Dimension.getHeight();
System.out.println("Width is "+Wid +'\n'+ "Height is "+Hei );

WebElement Color_of_Box = F.findElement(By.id("nav_menu-6"));
String RightBoxColor =Color_of_Box.getCssValue("background");
System.out.println("Color_of_Box is " +RightBoxColor);
	}

}
