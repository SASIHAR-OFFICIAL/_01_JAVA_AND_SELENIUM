package _S_05_07_01_Drop_Down_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Select_14_Sasi_25_Jun_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Gecko.Driver", "C:\\WebDriver\\geckodriver\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.navigate().to("https://letcode.in/dropdowns");

		WebElement visible_text = d.findElement(By.xpath("//*[@id=\"fruits\"]"));
		Select Fruit = new Select(visible_text);
		Fruit.selectByVisibleText("Apple");

		WebElement Hero = d.findElement(By.xpath("//*[@id=\"superheros\"]"));
		Select Super_Hero = new Select(Hero);
		Super_Hero.selectByIndex(03);
		//-------------------------------------
		JavascriptExecutor page_down = (JavascriptExecutor)d;
		page_down.executeScript("window.scrollBy(0,3250)", "");
		//-------------------------------------
		WebElement Langua = d.findElement(By.xpath("//*[@id=\"lang\"]"));
		String text = Langua.getText();
		System.out.println("List of Language = " +"\n" +text);
		System.out.println("----------------------------------");
		Select Langu_list = new Select(Langua);
		Langu_list.selectByValue("py");

		WebElement Country = d.findElement(By.xpath("//*[@id=\"country\"]"));
		Select Country_list = new Select(Country);
		Country_list.selectByValue("India");
		WebElement firstSelectedOption = Country_list.getFirstSelectedOption();
		System.out.println("Selected Country = "+firstSelectedOption.getText());
		d.close();
	}}
