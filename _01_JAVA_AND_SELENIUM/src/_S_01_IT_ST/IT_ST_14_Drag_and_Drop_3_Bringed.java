package _S_01_IT_ST;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IT_ST_14_Drag_and_Drop_3_Bringed {
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d;
		/*d.get("http://amazon.in");
		//d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(d, 20);
		d.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor) d;
		 js.executeScript("window.scrollBy(0,3750)", "");
		 Thread.sleep(5000);
		 js.executeScript("window.scrollBy(0,-3750)", "");
		//d.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("LED TV");
		//d.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		 //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		// WebDriverWait wait=new WebDriverWait(driver, 20);
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h5/a/span")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();*/
		d= new ChromeDriver();	
		d.get("http://demo.guru99.com/test/drag_drop.html");	
		d.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,1650)", "");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-1000)", "");

		//Element which needs to drag.    		
		WebElement From=d.findElement(By.xpath("//*[@id='credit2']/a"));	
		WebElement From1=d.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		//Element on which need to drop.		
		WebElement To=d.findElement(By.xpath("//*[@id='bank']/li"));
		WebElement To1=d.findElement(By.xpath(" //*[@id=\"amt7\"]/li"));

		//Using Action class for drag and drop.		
		Actions act=new Actions(d);					
		Thread.sleep(10000);
		//Dragged and dropped.		
		act.dragAndDrop(From, To).build().perform();
		act.dragAndDrop(From1, To1).build().perform();
	}		
}


