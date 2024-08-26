package _S_05_05_Text_Box_Edit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit_Text_Box_01_Sasi_Basic_2020 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://testleaf.herokuapp.com/pages/Edit.html");
		WebElement emailbox=d.findElement(By.id("email"));
		emailbox.sendKeys("testingfor@gmail.com");

		WebElement appendBox=d.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendBox.sendKeys(" typed word");

		WebElement getTextbox=d.findElement(By.name("username"));
		String value = getTextbox.getAttribute("value");
		System.out.println(value);

		WebElement ClearBox=d.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		//*[@id="contentblock"]/section/div[4]/div/div/input
		ClearBox.clear();
		
		WebElement disabledBox=d.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")); 
		boolean enabled=disabledBox.isEnabled();
		System.out.println(enabled);

	}

}
