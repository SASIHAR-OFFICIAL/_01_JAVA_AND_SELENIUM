package _S_01_IT_ST;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IT_ST_05_Scroll_Up_Down_4_Bringed {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
	
				
		d.get("http://executeautomation.com/demosite/index.html?UserName=Rajkumar&Password=colbuddy9&Login=Login");	
	//d.get("http://executeautomation.com/demosite/index.html?UserName=Rajkumar&Password=coolbuddy9&Login=Login");
		d.manage().window().maximize();
		//Thread.sleep(30000);
	
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		Actions a=new Actions(d);
		WebElement moveonmenu = d.findElement(By.xpath(".//*[@id='Automation Tools']"));
		
		a.moveToElement(moveonmenu).build().perform();
		
		Thread.sleep(3000);
		WebElement elem2 = d.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[2]/a"));
		a.moveToElement(elem2).build().perform();
		
		Thread.sleep(3000);
		
		WebElement elem3 = d.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[2]/ul/li[2]/a/span"));
		
		a.moveToElement(elem3).click().build().perform();
		
		Thread.sleep(30000);
		 
		d.get("https://www.amazon.in");
		Thread.sleep(8000);
		JavascriptExecutor jse = (JavascriptExecutor)d;
		jse.executeScript("window.scrollBy(0,3250)", "");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,-3250)", "");  

		Thread.sleep(80000);	 
	d.get("http://www.facebook.com");
		
		File src= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:/sss.jpg"));
		
		
	d.get("http://www.india.com");
        File src1= ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1, new File("C:/hhh.png"));
		
		
		
     d.navigate().back();
	    d.navigate().refresh();
    d.navigate().forward();   
		
	  
	}

}
