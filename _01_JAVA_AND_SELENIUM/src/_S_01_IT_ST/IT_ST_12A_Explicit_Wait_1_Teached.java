package _S_01_IT_ST;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IT_ST_12A_Explicit_Wait_1_Teached {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		 d.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	     //To maximize the browser
	d.manage().window().maximize();
	     //Create an object 'action' of an Actions class
	Thread.sleep(1000);
	Actions action1 = new Actions(d);
	By locator = By.cssSelector(".context-menu-one");
	//By locator = By.xpath("/html/body/div/section/div/div/div/p/span");
	     //Wait for the element. Used Explicit wait
	WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(5));
	//     WebDriverWait wait = new WebDriverWait(d, 5);
	     wait.until(ExpectedConditions.presenceOfElementLocated(locator)); 
	     WebElement rightClickElement=d.findElement(locator);
	     //contextClick() method to do right click on the element
	     action1.contextClick(rightClickElement).build().perform();
	     Thread.sleep(3000);
	     WebElement rce=d.findElement(By.cssSelector(".context-menu-icon-quit"));
	     Thread.sleep(4000);
	     rce.click();

	}

}
