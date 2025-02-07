package _S_05_12_Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_13_Sasi_08_Feb_2024 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver d = new FirefoxDriver();

d.navigate().to("https://demoqa.com/frames");
List<WebElement> Iframes = d.findElements(By.tagName("iframe"));
int Iframes_size = Iframes.size();
System.out.println("Iframes_size = "+Iframes_size);

WebDriver frame1 = d.switchTo().frame("frame1");
WebElement Heading = d.findElement(By.tagName("h1"));
String Heading_text = Heading.getText();
System.out.println("Heading_text = "+Heading_text);

d.switchTo().defaultContent();

WebDriver frame2 = d.switchTo().frame("frame2");
WebElement Heading2 = d.findElement(By.tagName("h1"));
String Heading_text2 = Heading2.getText();
System.out.println("Heading_text2 = "+Heading_text2);
Thread.sleep(3000);
d.quit();


	}

}
