package _S_05_09_Radio_Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio_Button_02_Sasi_Basic_2023 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver F =new FirefoxDriver();
F.get("https://www.leafground.com/radio.xhtml");
Thread.sleep(10000);

//Your most favorite browser------------------------------
WebElement Favorite_Browser = F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div/div/table/tbody/tr/td[2]/div/div[2]/span"));
Favorite_Browser.click();

WebElement Unselectable = Favorite_Browser.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/div/div/div/div/div[1]/div/div[2]/span"));
Unselectable.click();

//default select radio button--------------------------------
WebElement chrome = F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[1]/div/div[2]"));
WebElement firefox = F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[2]/div/div[2]"));
WebElement safari = F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[3]/div/div[2]"));
WebElement edge = F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/table/tbody/tr/td[4]/div/div[2]"));


boolean  Chrome_Status = chrome.isSelected();
boolean  firefox_Status = firefox.isSelected();
boolean  safari_Status = safari.isSelected();
boolean  edge_Status = edge.isSelected();

System.out.println("Chrome_Status = "+Chrome_Status+'\n'+"firefox_Status = "+firefox_Status +'\n'+"safari_Status = "+safari_Status +'\n'+"edge_Status = "+edge_Status );

//not selected-------------------------------------

WebElement First_Radio = F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]"));
First_Radio.click();

	}

}
