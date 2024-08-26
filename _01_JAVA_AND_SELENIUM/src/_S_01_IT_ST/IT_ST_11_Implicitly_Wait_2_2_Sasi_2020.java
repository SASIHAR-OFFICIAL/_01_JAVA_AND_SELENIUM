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

public class IT_ST_11_Implicitly_Wait_2_2_Sasi_2020 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		//Launch the Application Under Test (AUT)
		
		 d.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	     //To maximize the browser
	d.manage().window().maximize();
	     //Create an object 'action' of an Actions class
	Thread.sleep(1000);
	Actions action1 = new Actions(d);
	By locator = By.cssSelector(".context-menu-one");
	//By locator = By.xpath("/html/body/div/section/div/div/div/p/span");
	     //Wait for the element. Used Explicit wait
	     WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(30));
	     wait.until(ExpectedConditions.presenceOfElementLocated(locator)); 
	     WebElement rightClickElement=d.findElement(locator);
	     //contextClick() method to do right click on the element
	     action1.contextClick(rightClickElement).build().perform();
	     Thread.sleep(3000);
	     WebElement rce=d.findElement(By.cssSelector(".context-menu-icon-quit"));
	     Thread.sleep(4000);
	     rce.click();

	     d.switchTo().alert().accept();
	 // Alert alert = driver.switchTo().alert();
	    // alert.accept();
	     
	    //driver.findElement(By.cssSelector(".context-menu-icon-edit")).click();
	    // WebElement getCopyText =driver.findElement(By.cssSelector(".context-menu-icon-edit"));
	    WebElement getCopyText1 =d.findElement(By.name("Edit"));
	     //getText() method to get the text value
	     String GetText =getCopyText1.getText();
	     //To print the value
	     System.out.println(GetText);
	     //To close the browser
	     d.close();
			
		}

	}
