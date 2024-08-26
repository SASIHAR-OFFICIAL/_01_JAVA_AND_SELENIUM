package _S_04_Parthasarathy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop_Parthasarthy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		  driver.get("http://demo.guru99.com/test/drag_drop.html");	
		 
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,1250)", "");
		
			//jse.executeScript("window.scrollBy(0,-1250)", ""); 
			//Element which needs to drag.  		
	        	WebElement Fromdb=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));	
	        	WebElement Fromcs=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));	
	         //Element on which need to drop.		
	         WebElement Todphb=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));					
	        WebElement Tocphs=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));	
	         //Using Action class for drag and drop.		
	         Actions act=new Actions(driver);					

		//Dragged and dropped.		
	         act.dragAndDrop(Fromdb, Todphb).build().perform();
	         Thread.sleep(5000);
	         act.dragAndDrop(Fromcs, Tocphs).build().perform();	

		}	
	
	}


