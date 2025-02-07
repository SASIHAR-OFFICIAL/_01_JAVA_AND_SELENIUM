package _S_05_06_02_Buttons_Dimenson;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _05_Position_Size_Color_GetText_Sasi_Basic_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver F = new FirefoxDriver();
F.manage().window().maximize();
F.get("http://uitestingplayground.com/sampleapp");

WebElement Log_in_Box = F.findElement(By.id("login"));
Point Box_Location = Log_in_Box.getLocation();
int X_Location =Box_Location.getX();
int Y_Location  =Box_Location.getY();
System.out.println("X_Location is "+X_Location +'\n'+ "Y_Location is "+Y_Location );

WebElement size = F.findElement(By.id("login"));
Dimension Box_size = size.getSize();
int  Wid =Box_size.getHeight();
int Heg =Box_size.getWidth();
System.out.println("Width is "+Wid +'\n'+ "Heigth is "+Heg );

WebElement Box_color = F.findElement(By.id("login"));
String BoxColor = Box_color.getCssValue("background-color");
System.out.println("Box Color"+BoxColor);

WebElement Box_TEXT = F.findElement(By.id("login"));
String Text_In_box =Box_TEXT.getText();
System.out.println("Text_In_box "+Text_In_box);
	}

}
