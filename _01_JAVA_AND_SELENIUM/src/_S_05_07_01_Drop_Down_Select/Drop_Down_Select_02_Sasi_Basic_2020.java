package _S_05_07_01_Drop_Down_Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Select_02_Sasi_Basic_2020 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://www.leafground.com/home.html");
		Thread.sleep(3000);
		d.findElement(By.xpath("/html/body/div/div/div/div[2]/div[1]/div[2]/div/ul/li[5]/a/img")).click();
		
		WebElement selextIndex = d.findElement(By.id("dropdown1"));
		Select select1= new Select(selextIndex);
		select1.selectByIndex(1);
		/*Thread.sleep(3000);
		select.selectByValue("2");
		Thread.sleep(3000);
		select.selectByVisibleText("Loadrunner");*/
		
		WebElement selectText = d.findElement(By.name("dropdown2"));
		Select select2=new Select(selectText);
		select2.selectByVisibleText("Appium");
		
		WebElement selectValue = d.findElement(By.id("dropdown3"));
		Select select3=new Select(selectValue);
		select3.selectByValue("3");
		
		WebElement getOPtions =d.findElement(By.className("dropdown"));
		Select select4=new Select(getOPtions);
		List<WebElement> listofOptions= select4.getOptions();
		int noOfOpions=listofOptions.size();
		System.out.println("No of Options:" +noOfOpions);
		
		WebElement selectBySendKeys = d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/select"));
		selectBySendKeys.sendKeys("Loadrunner");
		
		WebElement multiSelect=d.findElement(By.xpath("/html/body/div/div/div[3]/section/div[6]/select"));
		Select multiSelectBox=new Select(multiSelect);
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(3);
		multiSelectBox.selectByIndex(4);
	}

}
