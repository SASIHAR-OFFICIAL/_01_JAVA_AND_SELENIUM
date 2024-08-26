package _S_01_IT_ST;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class IT_ST_05_Scroll_Up_Down_3_Bringed {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://www.amazon.in");
		//Thread.sleep(20000);
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
				
		/*JavascriptExecutor js = (JavascriptExecutor) d;  
		  js.executeScript("window.scrollBy(0,3000)");
		  Thread.sleep(7000);
		  js.executeScript("window.scrollBy(0,-2000)");*/
		  d.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung A 30 blue");
		d.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
		d.manage().window().maximize();
		d.findElement(By.cssSelector("#search > div.sg-row > div.sg-col-20-of-24.sg-col-28-of-32.sg-col-16-of-20.sg-col.s-right-column.sg-col-32-of-36.sg-col-8-of-12.sg-col-12-of-16.sg-col-24-of-28 > div > span:nth-child(4) > div.s-result-list.sg-row > div:nth-child(1) > div > div > div > div > div > div:nth-child(2) > div.sg-col-4-of-24.sg-col-4-of-12.sg-col-4-of-36.sg-col-4-of-28.sg-col-4-of-16.sg-col.sg-col-4-of-20.sg-col-4-of-32 > div > div > span > a > div > img")).click();
	  
		
		WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(30));

		
		w.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#add-to-cart-button"))).click();

				}

}
