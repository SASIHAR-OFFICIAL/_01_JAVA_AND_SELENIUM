package _S_05_04_Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Text_04_Sasi_Basic_2020 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://www.leafground.com/pages/Edit.html");
		
		//Thread.sleep(5000);
		
		WebElement emailBox=d.findElement(By.id("email"));
		emailBox.sendKeys("testing@gmail.com");
		
		WebElement typing=d.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		typing.sendKeys("Typing");
		
		WebElement getTextBox = d.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
		String value =getTextBox.getAttribute("value");
		System.out.println(value);
		
		WebElement clearBox=d.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearBox.clear();
		
		WebElement greybox =  d.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enabled = greybox.isEnabled();
		System.out.println(enabled);
	}

}
