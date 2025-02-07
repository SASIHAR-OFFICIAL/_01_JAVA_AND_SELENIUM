package _S_01_IT_ST;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IT_ST_14_Drag_and_Drop_1_Teached {

	public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			d.get("http://demo.guru99.com/test/drag_drop.html");	
			 
			  JavascriptExecutor jse = (JavascriptExecutor)d;
				jse.executeScript("window.scrollBy(0,1250)", "");
			
				//jse.executeScript("window.scrollBy(0,-1250)", ""); 
				//Element which needs to drag.    		
		        	WebElement From=d.findElement(By.xpath("//*[@id='credit2']/a"));	
		         
		         //Element on which need to drop.		
		         WebElement To=d.findElement(By.xpath("//*[@id='bank']/li"));					
		         		
		         //Using Action class for drag and drop.		
		         Actions act=new Actions(d);					

			//Dragged and dropped.		
		         act.dragAndDrop(From, To).build().perform();		
			}		

		
	}

