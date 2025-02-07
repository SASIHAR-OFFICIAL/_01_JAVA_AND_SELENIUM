package _S_01_IT_ST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IT_ST_21_slider_1_1_Teached {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			d.get("http://demo.automationtesting.in/Slider.html");
			Thread.sleep(3000);
			
			WebElement from = d.findElement(By.id("slider"));
			Actions a = new Actions(d);
			a.dragAndDropBy(from, 50, 0).build().perform();
		}	
		}
