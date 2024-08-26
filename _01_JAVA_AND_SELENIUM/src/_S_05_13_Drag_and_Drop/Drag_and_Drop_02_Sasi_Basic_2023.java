package _S_05_13_Drag_and_Drop;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_02_Sasi_Basic_2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C:\\WebDriver\\geckodriver\\geckodriver.exe");
WebDriver F = new FirefoxDriver();
F.get("https://www.leafground.com/drag.xhtml");

WebElement StartPoint = F.findElement(By.id("form:drag_content"));
WebElement EndPoint = F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/div/div/div[1]/div[2]/p"));
Actions DragAction = new Actions(F) ;
DragAction.clickAndHold(StartPoint).moveToElement(EndPoint).release(EndPoint).build().perform();

WebElement LeftBox =F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div[1]/div/div/div[1]/span"));
WebElement RightEdge = F.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/div[1]/div/div/div[2]/span"));
Actions LeftBoxDrag = new Actions(F);
LeftBoxDrag.dragAndDrop(LeftBox, RightEdge);


	}

}
