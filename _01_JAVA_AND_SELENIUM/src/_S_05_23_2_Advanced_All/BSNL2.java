package _S_05_23_2_Advanced_All;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BSNL2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().to("https://cymn.bsnl.co.in/cymnportal/Home.do");
		
		//Andhra
	 WebElement = {
				driver.findElement(By.xpath("//*[contains(text(),'ANDHRA')]"));
	            "https://www.wikipedia.org",
	            "https://www.github.com",
	            "https://www.stackoverflow.com"
	        };

	        // Loop through websites
	        for (String site : WebElement) {
	            driver.get(site);
	            try {
	                // Wait 3 seconds on each site for demonstration
	                Thread.sleep(3000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        //----------------------
		
		
		
		
		
		WebElement element3 = driver.findElement(By.xpath("//*[contains(text(),'ANDHRA')]"));
		WebElement element = driver.findElement(By.xpath("//*[@id=\"choosenum\"]"));
		Select select_obj = new Select(element);
		select_obj.selectByVisibleText("Search with start number");
		driver.findElement(By.xpath("//input[@placeholder='search with start number']")).sendKeys("96266");
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		
		//Andhra 2
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://cymn.bsnl.co.in/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[contains(text(),'ANDHRA')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Fancy Numbers(Fixed Price)')]")).click();
		//Thread.sleep(1500);
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"fancy_blk\"]"));
		Select select_obj2 = new Select(element2);
		select_obj2.selectByVisibleText("Search with start number");
		//Thread.sleep(3000);                                   
		driver.findElement(By.xpath("//input[@id='start_fancy']")).sendKeys("96266");
		//Thread.sleep(3000); 
		driver.findElement(By.xpath("//*[@id=\"searchID\"]")).click();
		Thread.sleep(10000);
		
		
		}
}