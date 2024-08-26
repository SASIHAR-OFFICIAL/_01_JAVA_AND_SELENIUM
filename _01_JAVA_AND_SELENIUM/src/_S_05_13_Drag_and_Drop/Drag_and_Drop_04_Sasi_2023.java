package _S_05_13_Drag_and_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_04_Sasi_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F =new FirefoxDriver();
		F.manage().window().maximize();
		F.get("https://demoqa.com/dragabble");

		WebElement Box_Now = F.findElement(By.xpath("//*[@id=\'dragBox\']"));
		WebElement Fixed_Box = F.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[3]"));
	//	WebElement Third_box = F.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[3]"));

		Actions Draging = new Actions(F);
		//Draging.clickAndHold(Box_Now).moveToElement(Fixed_Box).release(Fixed_Box).build().perform();

		Thread.sleep(1500);
		Draging.dragAndDrop(Box_Now,Fixed_Box ).build().perform();


	}

}
