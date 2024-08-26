package _S_05_06_02_Buttons_Dimenson;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _07_Position_Size_Color_GetText_Sasi_Basic_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver FBrowser = new FirefoxDriver();
FBrowser.manage().window().maximize();
FBrowser.get("https://thewire.in/");

WebElement RightBox = FBrowser.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[1]/div[5]/ul/li[1]/a"));
Point RightSideBoxLocation = RightBox.getLocation();
int X_Dirextion = RightSideBoxLocation.getX();
int Y_Dirextion = RightSideBoxLocation.getY();
System.out.println("X_Dirextion = "+X_Dirextion +'\n'+"Y_Dirextion = " +Y_Dirextion);
System.out.println("---------------------------");

Dimension RightBoxSize =RightBox.getSize();
int Height =RightBoxSize.getHeight();
int Width = RightBoxSize.getWidth();
System.out.println("Height = "+Height +'\n'+"Width = "+Width);
System.out.println("---------------------------");

String RightBox_Color =RightBox.getCssValue("background-color");
System.out.println("RightBox Color is = "+RightBox_Color);
System.out.println("---------------------------");

String RightBox_Text = RightBox.getText();
System.out.println("RightBox_Text is = "+RightBox_Text);

FBrowser.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[1]/div[5]/ul/li[1]/a")).click();


}

}
