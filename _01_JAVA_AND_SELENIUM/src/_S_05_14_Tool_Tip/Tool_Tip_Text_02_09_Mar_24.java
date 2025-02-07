package _S_05_14_Tool_Tip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tool_Tip_Text_02_09_Mar_24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d =new FirefoxDriver();
		d.navigate().to("https://in.search.yahoo.com/");
		
		WebElement Mail = d.findElement(By.xpath("/html/body/div[1]/div/div[2]/a/div"));
		String title = Mail.getAttribute("title");
		
		System.out.println("Title = "+title);
		Actions Mouse_Movment = new Actions(d);
		Mouse_Movment.moveToElement(Mail).build().perform();
		Thread.sleep(3000);
		d.close();

	}

}
