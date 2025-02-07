package _S_01_IT_ST;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IT_ST_10_Doube_Click_Bringed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver\\chromedriver.exe");
		 driver= new ChromeDriver();
/*
	//Launch the Application Under Test (AUT)
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	//Double click the button to launch an alertbox
	Actions action = new Actions(driver);
	WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	action.doubleClick(link).perform();
	Thread.sleep(5000);
	//driver.switchTo().alert().accept();
//Switch to the alert box and click on OK button
	Alert alert = driver.switchTo().alert();
	System.out.println("Alert Text\n" +alert.getText());
	Thread.sleep(5000);
	alert.accept();
	//Closing the driver instance
	//driver.quit();
	
	Thread.sleep(50000);*/
	
	 driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
     //To maximize the browser
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.manage().window().maximize();
     //Create an object 'action' of an Actions class
//Thread.sleep(1000);
Actions action1 = new Actions(driver);
//By locator = By.cssSelector(".context-menu-one");
By locator = By.xpath("/html/body/div/section/div/div/div/p/span");
     //Wait for the element. Used Explicit wait
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
     wait.until(ExpectedConditions.presenceOfElementLocated(locator)); 
     WebElement rightClickElement=driver.findElement(locator);
     //contextClick() method to do right click on the element
     action1.contextClick(rightClickElement).build().perform();
     Thread.sleep(3000);
     WebElement rce=driver.findElement(By.cssSelector(".context-menu-icon-edit"));
     Thread.sleep(4000);
     rce.click();
     Thread.sleep(4000);
     driver.switchTo().alert().accept();
 // Alert alert = driver.switchTo().alert();
    // alert.accept();
     
    //driver.findElement(By.cssSelector(".context-menu-icon-edit")).click();
    // WebElement getCopyText =driver.findElement(By.cssSelector(".context-menu-icon-edit"));
    WebElement getCopyText1 =driver.findElement(By.name("Edit"));
     //getText() method to get the text value
     String GetText =getCopyText1.getText();
     //To print the value
     System.out.println(GetText);
     //To close the browser
     driver.close();
		
	}

}
