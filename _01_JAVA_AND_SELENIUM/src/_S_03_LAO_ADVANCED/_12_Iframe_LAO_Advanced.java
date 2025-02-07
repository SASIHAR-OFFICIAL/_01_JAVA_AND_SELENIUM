package _S_03_LAO_ADVANCED;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _12_Iframe_LAO_Advanced {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver F =new FirefoxDriver();
F.get("https://www.leafground.com/frame.xhtml");
Thread.sleep(1500);

//Inside frame---------------------------------------------------------------
F.switchTo().frame(0);
WebElement Inside_frame = F.findElement(By.id("Click"));
Inside_frame.click();
String Click_Me = Inside_frame.getText();
System.out.println("Click_Me ="+Click_Me);

//Inside Nested frame part 1(Switch to MainWindow and Switch to Frame 1 and Switch to frame 2)-----------------------------
F.switchTo().defaultContent();
int I_Frame_Size = F.findElements(By.tagName("iframe")).size();
System.out.println("I_Frame_Size = "+I_Frame_Size);

F.switchTo().frame(3);

F.switchTo().frame("frame3");

//Inside Nested frame part 2----------------------------------------
WebElement Inside_Nested_frame = F.findElement(By.xpath("//*[@id=\"Click\"]"));
Inside_Nested_frame.click();
String Inside_Nested_Text = Inside_frame.getText();
System.out.println("Inside_Nested_Text ="+Inside_Nested_Text);

	}

}
