package _S_01_IT_ST;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class IT_ST_21_Slider_Bringed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
		 /* //  File file = new File("D:\\Driver\\IEDriverServer.exe");
		    System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.get("http://jqueryui.com/slider/");

		    WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/a"));
		    Actions move = new Actions(driver);
		    Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
		    ((Actions) action).perform();*/
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			    driver.get("http://jqueryui.com/slider/");
		    driver.switchTo().frame(0);
		    		
		    WebElement slider = driver.findElement(By.id("slider"));
		    int width=slider.getSize().getWidth();
		    Actions move = new Actions(driver);
		  Action action  = move.dragAndDropBy(slider, ((width*25)/100), 0).build();
		    action.perform();
		   Action action1  = move.dragAndDropBy(slider, ((width*-25)/100), 0).build();
		    action1.perform();
		    System.out.println("Slider moved");
		
		}

		}

	


