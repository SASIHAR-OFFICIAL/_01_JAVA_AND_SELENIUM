package _S_01_IT_ST;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IT_ST_14_Drag_and_Drop_4_Bringed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d;
 d= new ChromeDriver();	
		 
         d.get("http://demo.guru99.com/test/drag_drop.html");	
     
         d.manage().window().maximize();
         
         JavascriptExecutor js = (JavascriptExecutor) d;
		 js.executeScript("window.scrollBy(0,650)", "");
         
		//Element which needs to drag.    		
        	WebElement From=d.findElement(By.xpath("//*[@id='credit2']/a"));	
         
         //Element on which need to drop.		
         WebElement To=d.findElement(By.xpath("//*[@id='bank']/li"));					
         		
         //Using Action class for drag and drop.		
         Actions act=new Actions(d);					
         
	//Dragged and dropped.		
         act.dragAndDrop(From, To).build().perform();
         Thread.sleep(10000);
         
        // js.executeScript("window.scrollBy(0,-250)", "");
         
		 
	}

}
