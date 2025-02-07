package _S_05_06_02_Buttons_Dimenson;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _03_Position_Size_Color_Sasi_Basic_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdiver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver F = new FirefoxDriver();
F.manage().window().maximize();
F.get("https://www.leafground.com/button.xhtml");

WebElement Get_Poisition = F.findElement(By.id("j_idt88:j_idt94"));
Point xy = Get_Poisition.getLocation();
int X_Value   = xy.getX() ;
int Y_Value  = xy.getY();
System.out.println("X_Value is " +X_Value +'\n'+ "Y_Value is "+Y_Value);


WebElement BoxColor = F.findElement(By.id("j_idt88:j_idt90"));
String ColorOfBox = BoxColor.getCssValue("background");
System.out.println("Color of Box is " +ColorOfBox );

WebElement Size1 = F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/button/span[2]") );
int Height = Size1.getSize().getHeight();
int Width = Size1.getSize().getWidth();
System.out.println("Height = " +Height +"\n"+ "Width = "+Width);

WebElement Size2 = F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[3]/div/div/button/span") );
int Height2 = Size2.getSize().getHeight();
int Width2 = Size2.getSize().getWidth();
System.out.println("Height = " +Height2 +"\n"+ "Width = "+Width2);



	}

}
 