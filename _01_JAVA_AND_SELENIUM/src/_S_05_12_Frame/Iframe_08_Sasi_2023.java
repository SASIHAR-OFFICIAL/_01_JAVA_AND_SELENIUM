package _S_05_12_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe_08_Sasi_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver F = new FirefoxDriver(); //navigates to the Browser
		F.get("https://ui.vision/demo/webtest/frames/"); 

		//Frame Test Page----------------------------------
		F.switchTo().frame(0);
		F.findElement(By.xpath("/html/body/center/center/form/div/input")).sendKeys("5896321470");

		//Frame2--------------------------------------------
		F.switchTo().defaultContent();
		F.switchTo().frame(1);
		F.findElement(By.xpath("/html/body/form/div/input")).sendKeys("5896321470");

		//Frame3-------------------------------------------------
		F.switchTo().defaultContent();
		F.switchTo().frame(2);
		F.findElement(By.xpath("/html/body/form/div/input")).sendKeys("5896321470");
		WebElement GForm = F.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));

		F.switchTo().frame(GForm);

	
		WebElement human =	F.findElement(By.xpath("/html/body/div/div/form/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/span/div/div[2]/label/div/div[1]/div/div[3]/div"));
		human.click();
		Thread.sleep(3000);

		WebElement Web  =	F.findElement(By.xpath("/html/body/div/div/form/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/label/div/div[1]/div[2]"));
		Web.click();
		WebElement auto_fill =	F.findElement(By.xpath("/html/body/div/div/form/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/label/div/div[1]/div[2]"));
		auto_fill.click();
		WebElement general1 =	F.findElement(By.xpath("/html/body/div/div/form/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[1]/div[3]/label/div/div[1]/div[2]"));
		general1.click();
		Thread.sleep(1500);
		
		WebElement LoopButon = F.findElement(By.xpath("/html/body/div/div/form/div[2]/div[1]/div[2]/div[3]/div/div/div[2]/div/div[1]/div[2]"));
		Select LoopSelect = new Select(LoopButon);
		LoopSelect.selectByIndex(1);
	
		
			
		

		//Frame4-------------------------------------------------
		F.switchTo().defaultContent();
		F.switchTo().frame(3);
		F.findElement(By.xpath("/html/body/form/div/input")).sendKeys("5896321470");

		//Frame5-------------------------------------------------
		F.switchTo().defaultContent();
		F.switchTo().frame(4);
		F.findElement(By.xpath("/html/body/form/div/input")).sendKeys("5896321470");



	}

}