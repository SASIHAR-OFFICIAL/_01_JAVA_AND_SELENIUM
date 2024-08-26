package _S_01_IT_ST;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IT_ST_10_Doube_Click_1_Teached {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		//Launch the Application Under Test (AUT)
		d.get("http://demo.guru99.com/test/simple_context_menu.html");
		//Double click the button to launch an alertbox
		Actions action = new Actions(d);
		WebElement link =d.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(link).perform();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept();
			
			}

}
