package _S_05_12_Frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe_12_Sasi_06_Feb_2024 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver d = new FirefoxDriver();
d.manage().window().maximize();

d.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

List<WebElement> Iframe = d.findElements(By.tagName("iframe"));
int Iframe_size = Iframe.size();
System.out.println("Iframe_size = "+Iframe_size);

d.switchTo().frame(0);
Thread.sleep(5000);
Actions a = new Actions(d);
WebElement More = d.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[9]/a"));
a.moveToElement(More).build().perform();

d.quit();

//Actions a=new Actions(driver);
//WebElement Dashboard = driver.findElement(By.xpath("/html/body/form/div[3]/div/div[2]/ul/li[8]"));
//a.moveToElement(Dashboard).build().perform();



//String title = frame_0.getTitle();
//System.out.println("Title = "+title);


//Actions a = new Actions(d);
//WebElement More = d.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[2]/nav/div[2]/ul/li[9]/a"));
//a.moveToElement(More).build().perform();



	}

}
