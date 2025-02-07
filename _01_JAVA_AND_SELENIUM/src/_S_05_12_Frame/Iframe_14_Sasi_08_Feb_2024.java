package _S_05_12_Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe_14_Sasi_08_Feb_2024 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();

		d.navigate().to("https://demoqa.com/nestedframes");
		List<WebElement> Iframe = d.findElements(By.tagName("Iframe"));
		int Iframe_size = Iframe.size();
		System.out.println("Iframe_size ="+Iframe_size);
		d.switchTo().frame(6);
		
		WebElement Body = d.findElement(By.xpath("/html/body"));
		String Body_text = Body.getText();
		System.out.println("Body_text = "+Body_text);
		
		Thread.sleep(5000);
		d.quit();
	}

}
